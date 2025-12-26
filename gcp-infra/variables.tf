variable "project_id" {}
variable "region" { default = "us-central1" }
variable "zone"   { default = "us-central1-a" }

variable "cluster_name" { default = "harness-gke-cluster" }
variable "network_name" { default = "harness-vpc" }
variable "subnet_name"  { default = "harness-subnet" }

variable "artifact_repo" { default = "harness-repo" }

variable "sa_name" { default = "harness-gke-sa" }
