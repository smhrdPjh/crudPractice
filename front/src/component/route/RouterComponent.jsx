import React from 'react';
import { BrowserRouter, Route, Switch} from 'react-router-dom';
import UserListComponent from "../UserListComponent";
import AddUserComponent from "../AddUserComponent";
import EditUserComponent from "../EditUserComponent";

const AppRouter = () => {
   return(
     <div>
       <BrowserRouter>
        <div style={style}>
          <Switch>
            <Route exact path="/" component={UserListComponent} />
            <Route path="/users" component={UserListComponent} />
            <Route path="/add-user" component={AddUserComponent} />
            <Route path="/edit-user" component={EditUserComponent} />
          </Switch>
        </div>
       </BrowserRouter>
     </div>
   );
}

const style = {
  marginTop: '20px'
}

export default AppRouter;