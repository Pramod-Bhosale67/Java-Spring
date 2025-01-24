import React, { useState } from "react";

function JobForm({ addJob }) {
  const [formData, setFormData] = useState({
    title: "",
    description: "",
    experience: "",
    techStack: "",
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({ ...formData, [name]: value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const { title, description, experience, techStack } = formData;
    addJob({
      title,
      description,
      experience: parseInt(experience),
      techStack: techStack.split(",").map((tech) => tech.trim()),
    });
    setFormData({ title: "", description: "", experience: "", techStack: "" });
  };

  return (
    <form onSubmit={handleSubmit} className="bg-white p-6 rounded shadow-md mb-6">
      <h2 className="text-xl font-semibold mb-4">Add a New Job</h2>
      <div className="mb-4">
        <label className="block mb-2 font-medium">Job Title</label>
        <input
          type="text"
          name="title"
          value={formData.title}
          onChange={handleChange}
          className="w-full p-2 border rounded"
          required
        />
      </div>
      <div className="mb-4">
        <label className="block mb-2 font-medium">Description</label>
        <textarea
          name="description"
          value={formData.description}
          onChange={handleChange}
          className="w-full p-2 border rounded"
          required
        />
      </div>
      <div className="mb-4">
        <label className="block mb-2 font-medium">Experience (years)</label>
        <input
          type="number"
          name="experience"
          value={formData.experience}
          onChange={handleChange}
          className="w-full p-2 border rounded"
          required
        />
      </div>
      <div className="mb-4">
        <label className="block mb-2 font-medium">Tech Stack (comma-separated)</label>
        <input
          type="text"
          name="techStack"
          value={formData.techStack}
          onChange={handleChange}
          className="w-full p-2 border rounded"
          required
        />
      </div>
      <button
        type="submit"
        className="w-full bg-blue-500 text-white p-2 rounded hover:bg-blue-600"
      >
        Add Job
      </button>
    </form>
  );
}

export default JobForm;