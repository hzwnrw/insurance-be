> ⚠️ Mirror repository  
> Primary development happens on Gitea:  
> https://git.hzwnrw.my/Insurance/insurance-be

# Insurance BE

## Project Overview

Insurance BE is a backend service designed to manage insurance-related operations. Built using Java, this application provides essential functionalities for handling insurance processes efficiently.

## Features

- **Claims Management**: Process and track insurance claims.

## Tech Stack

- **Backend**: Java
- **Build Tool**: Maven
- **Containerization**: Docker

## Getting Started

### Prerequisites

Ensure you have the following installed:

- Java 21 or higher
- Maven
- Docker (optional, for containerization)

### Installation

1. Clone the repository:

   git clone https://git.hzwnrw.my/Insurance/insurance-be.git
   cd insurance-be

2. Build the project using Maven:
    mvn clean install

3. (Optional) Build and run with Docker:
    docker build -t insurance-be .
    docker run -p 8080:8080 insurance-be

