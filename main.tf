terraform{
    required_version = ">= 1.5"
}

provider "aws" {
  profile = "aprendizado93" 
  region = "us-east-1"
}

resource "aws_s3_bucket" "terraform_bucket" {
  bucket = "terraform-example-bucket-1234567890"
  acl    = "private"
}

resource "aws_instance" "terraform-ec2-instance" {
  ami           = "ami-005f0d81384686e83" # Example AMI, replace with a valid one
  instance_type = "t2.micro"

  tags = {
    Name = "ExampleInstance"
  }

  }
  
resource "aws_db_instance" "db-test3" {
  allocated_storage      = 10
  identifier             = "postgres-test3"
  engine                 = "postgres"
  engine_version         = "14.17"
  instance_class         = "db.t4g.micro"
  db_name                = "terraformpostgres"
  username               = "postgres"
  password               = "postgres"
  skip_final_snapshot    = true
}

resource "aws_sqs_queue" "terraformfila" {
  name = "terraform-example-queue"

}
