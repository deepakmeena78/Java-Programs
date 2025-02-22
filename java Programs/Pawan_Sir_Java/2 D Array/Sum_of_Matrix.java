export const getUserWithCompletedTasks = (req, res) => {
    const id = req.params.id;

    pool.getConnection((err, con) => {
        if (err) {
            return res.status(500).json({ error: "Database connection failed" });
        }

        // Single optimized query using JOIN
        let sql = `
            SELECT u.*, t.* 
            FROM user u 
            LEFT JOIN task_user t ON u.id = t.id 
            WHERE u.id = 1 AND t.status = 'complete'
        `;

        con.query(sql, [id], (err, result) => {
            con.release();
            if (err) {
                return res.status(500).json({ error: "Query failed" });
            }

            // Extracting user and tasks separately
            let user = result.length > 0 ? {
                id: result[0].id,
                name: result[0].name,
                email: result[0].email
            } : null;

            let tasks = result.map(row => ({
                task_id: row.task_id,
                title: row.title,
                status: row.status
            })).filter(task => task.task_id); // Remove null tasks

            // Sending data to EJS
            res.render("UserProfile.ejs", { user, tasks });
        });
    });
};
