import React from "react";

function JobList({ jobs }) {
  return (
    <div className="bg-white p-6 rounded shadow-md">
      <h2 className="text-xl font-semibold mb-4">Job Listings</h2>
      {jobs.map((job) => (
        <div key={job.id} className="mb-4 border-b pb-4 last:border-b-0">
          <h3 className="text-lg font-bold">{job.title}</h3>
          <p className="text-gray-700">{job.description}</p>
          <p className="text-gray-600">
            <strong>Experience:</strong> {job.experience} years
          </p>
          <p className="text-gray-600">
            <strong>Tech Stack:</strong> {job.techStack.join(", ")}
          </p>
        </div>
      ))}
    </div>
  );
}

export default JobList;