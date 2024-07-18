import { useNavigate } from "react-router-dom";

function Logout() {

let navigate = useNavigate();

let handleLogout= ()=> {

    navigate("/")
}
    return(
        <div>
            <input type="button" value="logout" onClick={handleLogout}/>
        </div>
    )
}

export default Logout;