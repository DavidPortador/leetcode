# Use Ubuntu minimal as base image 
FROM ubuntu:24.04

# Install essential packages only
RUN apt-get update \
    && apt-get install -y --no-install-recommends \
        curl \
        wget \
        ca-certificates \
        build-essential \
        python3 \
        openjdk-21-jdk \
        nodejs \
        npm \
        php-cli \
    && wget https://packages.microsoft.com/config/ubuntu/24.04/packages-microsoft-prod.deb -O packages-microsoft-prod.deb \
    && dpkg -i packages-microsoft-prod.deb \
    && rm packages-microsoft-prod.deb \
    && apt-get update \
    && apt-get install -y --no-install-recommends dotnet-sdk-10.0 \
    && npm install -g typescript \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

# Create workspace directory and set it as working directory
WORKDIR /workspace

# Default command
CMD ["bash"]