import "./App.css";
import Home from "./component/Home";
import Navbar from "./component/Navbar";
import AddProduct from "./component/AddProduct";
import { Routes, Route } from "react-router-dom";

function App() {
  return (
    <>
      <Navbar />

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/addProduct" element={<AddProduct />} />
      </Routes>
    </>
  );
}

export default App;
