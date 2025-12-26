output "cluster_name" {
  value = google_container_cluster.gke.name
}

output "cluster_endpoint" {
  value = google_container_cluster.gke.endpoint
}

output "service_account_email" {
  value = google_service_account.gke_sa.email
}

output "artifact_repo_url" {
  value = "${var.region}-docker.pkg.dev/${var.project_id}/${var.artifact_repo}"
}
