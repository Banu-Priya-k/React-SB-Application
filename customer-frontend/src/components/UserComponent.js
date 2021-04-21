import React from 'react'
import UserService from '../services/UserService'

class UserComponent extends React.Component{

    constructor(props){
        super(props)
        this.state ={currentDateTime: Date().toLocaleString(),
            users:[]
        }
    }


    componentDidMount(){
        
        UserService.getUsers().then((response) => {
            this.setState({users : response.data})
        });
    }

    render(){
        return(
            
            <div class="container">
                <br></br>
                <h2 className="float-left mb-4">CUSTOMER DETAILS</h2>
                <br></br>
                <p class="float-right mb-5">
                    { this.state.currentDateTime }
                </p>
                <table className="table table-hover table-striped"> 
                    <thead class="table-dark">
                        <tr>
                            <td><b> Customer ID</b></td>
                            <td><b>First Name</b></td>
                            <td><b>Last Name</b></td>
                            <td><b>Email</b></td>
                        </tr>
                    </thead>
                    <tbody>{
                        this.state.users.map(
                            user => 
                            <tr key ={user.id}>
                                <td>{user.id}</td>
                                <td>{user.firstName}</td>
                                <td>{user.lastName}</td>
                                <td>{user.email}</td>
                            </tr>
                        )    
                    }
                    </tbody>
                </table>
            </div>
        )
    }

}

export default UserComponent