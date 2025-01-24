import { useState } from "react";
import "./App.css";
import posts from "./Data/db";
import JobForm from "./components/JobForm";
import JobList from "./components/JobList";

function App() {
  
  const [jobs, setJob] = useState(posts);

  const addJob = (newJob) => {
     setJob([...jobs, {id: jobs.length + 1, ...newJob}]);
  };
  
  return (
    <div className="min-h-screen bg-gray-100 p-6">
     <h1 className="text-3xl font-bold text-center mb-6">Job Application Portal</h1>
        <div className="max-w-4xl mx-auto">
          <JobForm addJob={addJob} />
          <JobList jobs={jobs} />
        </div>
  </div>
  );
}

export default App;
