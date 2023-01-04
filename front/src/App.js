import logo from './logo.svg';
import './App.css';
import AppRouter from './component/route/RouterComponent';
import NavBar from './component/route/NavBar';

function App() {
  return (
    <div className="App">
      <NavBar />
     <AppRouter/>
    </div>
  );
}

export default App;
