CREATE TABLE logs (
  id INT PRIMARY KEY AUTO_INCREMENT,
  type VARCHAR(255),
  memo VARCHAR(255),
  occurred_at DATETIME,
  created_at DATETIME
);
