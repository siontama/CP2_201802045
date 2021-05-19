import './App.css';
import Header from "./components/Header";
import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom"
import About from "./pages/About";
import Cities from "./pages/Cities";
import Home from "./pages/Home";

function App() {
    const city = "Seoul";

    return (
      <Router>
        <div className="App">
            <Header region="KR" cityName={city} />
            <ul className="menu">
              <li className="navigation">
                <Link to="/">Home</Link>
              </li>
              <li className="navigation">
                <Link to="/about">About</Link>
              </li>
              <li className="navigation">
                <Link to="/cities">Cities</Link>
              </li>
            </ul>

            <Switch>
              <Route path="/about">
                <About />
              </Route>
              <Route path="/cities">
                <Cities />
              </Route>
              <Route path="/">
                <Home />
              </Route>
            </Switch>
        </div>
      </Router>
    );
}

export default App;