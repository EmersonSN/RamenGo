CREATE TABLE broth (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    image_inactive VARCHAR(255) NOT NULL,
    image_active VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    price INTEGER NOT NULL
);

CREATE TABLE protein (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    image_inactive VARCHAR(255) NOT NULL,
    image_active VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    description VARCHAR(255) NOT NULL,
    price INTEGER NOT NULL
);
