const form=document.getElementById("loginform");

form.addEventListener("submit",function (res){
    res.preventDefault();

    const username=document.getElementById("username").value;
    const password=document.getElementById("password").value;
         
    fetch("http://localhost:8084/api/login",{
        method:"POST",
        headers:{
            "Content-Type":"application/json"
        },
       body: JSON.stringify({username,password}),
    })

    .then((res)=>{
        //login succeddd
        if(res.ok){
        console.log("login success")
        }
        else{
            console.log("not success")
        }
    })
    .catch((error)=>{
        console.log(error)
    })

})