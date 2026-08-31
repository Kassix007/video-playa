function checkLogin(){
    var loginId = localStorage.getItem('loginid');
    var phone = localStorage.getItem('phone');
    var token = localStorage.getItem('token');
    if (!loginId || !phone || !token) {
        return false;
    }
    return true;
}

function isLogin(){

    return true;
}


function logalert(){

        MOBILE = 1;
        //ADD MENU ITEEMS TO MENU
        var menu = document.getElementById('main-menu');

        menu.innerHTML += '<li><a href="' + BASE + 'football/">Football</a></li>';
        if(!checkLogin()) {
            menu.innerHTML += '<li><a href="' + BASE + 'login/">Login </a></li>';
            menu.innerHTML += '<li><a href="' + BASE + 'register/">Create Account </a></li>';
        }
        if(checkLogin()) {
            menu.innerHTML += '<li><a href="' + BASE + 'logout/">Logout</a></li>';
        }

        var currentUrl = window.location.pathname;
        /*if (currentUrl !== '/login/' && currentUrl !== '/login' && currentUrl !== '/login.php') {
            //CHECK IF LOCAL STORAGE CONTAINS LOGIN ID
            var loginId = localStorage.getItem('loginid');
            if (!loginId || isNaN(loginId)) {
                window.location.href = '/login';
            } else {

            }
        }*/
        if (currentUrl == '/logout/' || currentUrl == '/logout' || currentUrl == '/logout.php') {
            logout();
        }

        if (currentUrl == '/mobilepay/' || currentUrl == '/mobilepay' || currentUrl == '/mobilepay.php') {
            document.getElementById('phone').value=getPhone();
        }

        if (currentUrl == '/withdrawal/' || currentUrl == '/withdrawal' || currentUrl == '/withdrawal.php') {
            mobileWithdraw();
        }

        //ADD LOGIN TO BET SLIP



}

function login(){
    event.preventDefault();
    var number = document.querySelector('input[name="number"]').value;
    var form = document.querySelector('.optplaceholder');
    
    //CHECK NUMBER
    if (number.length < 5) {
        form.innerHTML = '<span class="error">Invalid phone number specified.</span>';
        return;
    }

    form.innerHTML="";
    $.ajax({
        url: BASE + 'otp/',
        method: 'POST',
        data: {
            number: number
        },
        success: function (response) {
            // Show OTP input field

            form.innerHTML = '<label>Your OTP</label><input type="text" class="inp" name="otp" placeholder="Enter OTP">' +
                '<br/><input class="sendsms" type="button" value="Confirm OTP" onclick="verifyOtp()"><br/><br/>';
        },
        error: function (xhr, status, error) {
            document.getElementById('error-message').innerHTML = 'Error requesting OTP, please try again later.';
        }
    });
}

function registerSMS(){
        var sms=document.getElementById('registerSMS').innerHTML;
        window.location.href = 'sms:8685?&body=' + sms.trim();

}

function register() {
    event.preventDefault();
    document.getElementById('register-success').style.display = 'none';
    document.getElementById('register-error').style.display = 'none';
    document.getElementById('register-success').innerHTML = '';
    document.getElementById('register-error').innerHTML ='';
    const firstname = document.querySelector('input[name="firstname"]').value;
    const lastname = document.querySelector('input[name="lastname"]').value;
    const otp = document.querySelector('input[name="otp"]').value;
    const nid = document.querySelector('input[name="nid"]').value;
    const phone = document.querySelector('input[name="phone"]').value;
    const address = document.querySelector('textarea[name="address"]').value;
    const operator = document.querySelector('select[name="operator"]').value;

    if (!firstname || !lastname || !nid || !phone || !address || !operator) {
        const registerError = document.getElementById('register-error');
        registerError.style.display = 'block';
        registerError.classList.add('error');
        registerError.innerHTML = 'All fields are required';
        return;
    }

    if(otp==0) {
        $.ajax({
            url: BASE + 'registerremote/',
            method: 'POST',
            data: {
                firstname: firstname,
                lastname: lastname,
                nid: nid,
                phone: phone,
                address: address,
                operator: operator,
                otp: otp
            },
            success: function (response) {
                try {
                    let responseData = JSON.parse(response);

                    if (responseData.status === 0) {
                        document.getElementById('otpblock').innerHTML = '<label>Please enter OTP and register</label>'+'<input class="inp" class="otp" name="reqotp" required/><br/>';
                        document.getElementById('button-register').value='Register';
                        document.querySelector('input[name="phone"]').disabled = true;
                        document.querySelector('input[name="firstname"]').disabled = true;
                        document.querySelector('input[name="lastname"]').disabled = true;
                        document.querySelector('input[name="nid"]').disabled = true;
                        document.querySelector('textarea[name="address"]').disabled = true;
                        document.querySelector('input[name="otp"]').value=1;
                    } else {
                        document.getElementById('register-error').style.display = 'block';
                        document.getElementById('register-error').innerHTML = responseData.message || responseData.reply.message;
                    }
                } catch (e) {
                    document.getElementById('register-error').style.display = 'block';
                    document.getElementById('register-error').innerHTML = 'Error processing registration, please try again later.';
                }

            },
            error: function (xhr, status, error) {
                document.getElementById('register-error').style.display = 'block';
                document.getElementById('register-error').innerHTML = 'Error processing registration, please try again later.';
            }
        });
    }
    else if(otp==1){

        const reqotp = document.querySelector('input[name="reqotp"]').value;
        document.getElementById('button-register').value='Creating account...';
        document.getElementById('button-register').disabled = true;

        let fd = new FormData();

        fd.append("firstname", firstname);
        fd.append("lastname", lastname);
        fd.append("nid", nid);
        fd.append("phone", phone);
        fd.append("address", address);
        fd.append("operator", operator);
        fd.append("reqotp", reqotp);
        
        
        let file = $("#nidimage")[0].files[0];
        if(file){
            fd.append("image", file);
        }
        $.ajax({
            url: BASE + 'registerremote/',
            type: 'POST',
            contentType: false,
            processData: false,
            data: fd,
            success: function (response) {
                try {
                    let responseData = JSON.parse(response);

                    if (responseData.status === 0) {

                        document.getElementById('button-register').value='Creating account ... ';
                        document.getElementById('register').innerHTML = '';
                        document.getElementById('register-success').style.display = 'block';
                        document.getElementById('register-success').innerHTML=(responseData.message || responseData.reply.message)+
                            '<br/><a href="'+BASE+'login/">Tap here to login.</a>';
                    } else {
                        document.getElementById('register-error').style.display = 'block';
                        document.getElementById('register-error').innerHTML = responseData.message || responseData.reply.message;
                        document.getElementById('button-register').value='Register';
                        document.getElementById('button-register').disabled = false;
                    }
                } catch (e) {
                    document.getElementById('register-error').style.display = 'block';
                    document.getElementById('register-error').innerHTML = 'Error processing registration, please try again later.';
                    document.getElementById('button-register').value='Register';
                    document.getElementById('button-register').disabled = false;
                }

            },
            error: function (xhr, status, error) {
                document.getElementById('register-error').style.display = 'block';
                document.getElementById('register-error').innerHTML = 'Error processing registration, please try again later.';
                document.getElementById('button-register').value='Register';
                document.getElementById('button-register').disabled = false;
            }
        });

    }
}


function verifyOtp() {
    var number = document.querySelector('input[name="number"]').value;
    var otp = document.querySelector('input[name="otp"]').value;
    var referer = document.querySelector('input[name="referer"]').value;


    $.ajax({
        url: BASE + 'confirm/',
        method: 'POST',
        data: {
            number: number,
            otp: otp,
            referer:referer
        },
        success: function (response) {

            try {
                let responseArray = JSON.parse(response);
                if (responseArray.status === 0) {
                    localStorage.setItem('loginid', responseArray.reply.id);
                    localStorage.setItem('phone', responseArray.reply.phone);
                    localStorage.setItem('token', responseArray.reply.token);
                    //window.location.href = '/';
                    loadProfile();
                } else {
                    document.getElementById('error-message').innerHTML = responseArray.reply.message || 'Invalid OTP';
                }
            } catch (e) {

                document.getElementById('error-message').innerHTML = 'Error processing OTP. Please try again';
            }
        },
        error: function (xhr, status, error) {
            document.getElementById('error-message').innerHTML = 'Error verifying OTP';
        }
    });
}

function logout() {
    localStorage.removeItem('loginid');
    localStorage.removeItem('phone');
    localStorage.removeItem('token');
    window.location.href = '/login';
}

function sendSMSOther(){

    event.preventDefault();
    var loginId = localStorage.getItem('loginid');
    var phone = localStorage.getItem('phone');
    var token = localStorage.getItem('token');
    var message = $("#message").val();

    $.ajax({
        url: BASE + 'placebet/',
        method: 'POST',
        data: {
            loginid: loginId,
            phone: phone,
            token: token,
            message: message
        },
        success: function (response) {
            //console.log(response);
            // alert('Bet placed successfully');
        },
        error: function (xhr, status, error) {
            //alert('Error placing bet');
        }
    });
}



function getPhone(){
    return localStorage.getItem('phone');
}

function loadProfile(){
    var loginId = localStorage.getItem('loginid');
    var phone = localStorage.getItem('phone');
    var token = localStorage.getItem('token');

    if (!loginId || !phone || !token) {
        
    }
    else{
        var profileDiv = document.querySelector('#profile');
        var s = 'You are currently logged in with phone number:<b>' + phone+"</b><br/>You may now place your bets directly. <br/><br/>";
        s+="<br/><a href='"+BASE+"logout'>Click here</a> to logout.";
        profileDiv.innerHTML=s;
        document.querySelector('#login').style.display = 'none';
    }
}


async function checklogin() {

    let loginId = localStorage.getItem('loginid');
    let phone = localStorage.getItem('phone');
    let token = localStorage.getItem('token');

    if (!loginId || !phone || !token) {
        return false;
    }

    return new Promise((resolve, reject) => {
        $.ajax({
            url: BASE + 'checklogin/',
            method: 'POST',
            data: {
                loginid: loginId,
                phone: phone,
                token: token,
            },
            success: function(response) {
                try {
                    let responseData = JSON.parse(response);
                    resolve(responseData.status == 0); // true or false
                } catch (e) {
                    resolve(false);
                }
            },
            error: function() {
                resolve(false);
            }
        });
    });

}


function withdrawal(){
    $('.withdraw-error').hide();
    $('.withdraw-success').hide();
    var amount = $('#amount').val();
    var bankCode = $('#bankcode').val();
    var accountNo = $('#accountno').val();

    if (!amount || !bankCode || !accountNo) {
        $('.withdraw-error').show();
        $('.withdraw-error').html('Please fill all fields');
        return;
    }

    var loginId = localStorage.getItem('loginid');
    var phone = localStorage.getItem('phone');
    var token = localStorage.getItem('token');
    var message = "";

    $("#withdrawal").prop("disabled", true);

    $("#withdrawal").html('Submitting...');
    checklogin().then((logincheck) => {
        if (!logincheck) {
            $(".withdraw-error").show();
            $(".withdraw-error").html('<h3 class="error">Your session has expired.</h3><a href="'+BASE+'login"><button>Please login to<br/> place bet</button></a>');
            localStorage.removeItem('loginid');
            localStorage.removeItem('phone');
            localStorage.removeItem('token');
            return;
        }

        $.ajax({
            url: BASE + 'withdraw/',
            method: 'POST',
            data: {
                loginid: loginId,
                phone: phone,
                token: token,
                message: message,
                amount:amount,
                bankCode:bankCode,
                accountNo:accountNo
            },
            success: function (response) {
                try {
                    let responseData = JSON.parse(response);
                    if (responseData.status == 0) {
                        $(".withdraw-success").show();
                        $(".withdraw-success").html('<h3>'+(responseData.reply.message)+'</h3>');
                        $("#withdrawal").html('Submit Withdrawal Request');
                        $("#withdrawal").prop("disabled", false);
                    } else {
                        $(".withdraw-error").show();
                        $(".withdraw-error").html('<h3 class="error">'+(responseData.reply.message)+'</h3>');
                        $("#withdrawal").html('Submit Withdrawal Request');
                        $("#withdrawal").prop("disabled", false);
                    }
                } catch (e) {
                    $(".withdraw-error").show();
                    $(".withdraw-error").html('<h3 class="error">An error has occured, please try again later.</h3>');
                    $("#withdrawal").html('Submit Withdrawal Request');
                    $("#withdrawal").prop("disabled", false);
                }
            },
            error: function (xhr, status, error) {
                $(".withdraw-error").show();
                $(".withdraw-error").html('<h3 class="error">Please check your connection and try again.</h3>');
                $("#withdrawal").html('Submit Withdrawal Request');
                $("#withdrawal").prop("disabled", false);
            }
        });
    });
}


function mobile(){

    var loginId = localStorage.getItem('loginid');
    var phone = localStorage.getItem('phone');
    var token = localStorage.getItem('token');
    if(MOBILE==1) {
        if (!loginId || !phone || !token) {
            document.getElementById('mobile-place-bet').innerHTML = '<a href="'+BASE+'login"><button>Please login to<br/> place bet by app</button></a>';
        } else {
            document.getElementById('mobile-place-bet').innerHTML = '<button id="placebet" onclick="placebet()" disabled>Place bet by app</button>';

        }
    }
}

function mobileWithdraw(){
    var loginId = localStorage.getItem('loginid');
    var phone = localStorage.getItem('phone');
    var token = localStorage.getItem('token');
    if(MOBILE==1) {
        if (!loginId || !phone || !token) {
            $('#withdrawalform').hide();
            $('#login').show();
        } else {
            $('#withdrawalform').show();
            $('#login').hide();

        }
    }
}


function placebet(){
    var stake=$("#stake").val();
    var rh=$("#selection").val();
    var bettype=$("#bettype").val();
    var t=0;
    if(bettype=="win"){
        t="";
    }
    else if(bettype=="place"){
        t="P";
    }
    
    
    var sms=stake+""+rh+""+t;
    sms= sms.trim();

    var loginId = localStorage.getItem('loginid');
    var phone = localStorage.getItem('phone');
    var token = localStorage.getItem('token');
    var message = sms;
    $("#placebet").prop("disabled", true);
    $("#placebet").html('Placing bet...');
    checklogin().then((logincheck) => {
        if (!logincheck) {
            $(".footer-betslip").html('<h3 class="error">Your session has expired.</h3><a href="'+BASE+'login"><button>Please login to<br/> place bet</button></a>');
            localStorage.removeItem('loginid');
            localStorage.removeItem('phone');
            localStorage.removeItem('token');
            return;
        }



    $.ajax({
        url: BASE + 'placebet/',
        method: 'POST',
        data: {
            loginid: loginId,
            phone: phone,
            token: token,
            message: message
        },
        success: function (response) {
            try {
                let responseData = JSON.parse(response);
                if (responseData.status == 0) {
                    var o="";
                    if(responseData.reply.out!=""){
                        o=responseData.reply.out;
                    }
                    $(".footer-betslip").html('<h3>'+o+'</h3>'+'<h3>'+(responseData.reply.message)+'</h3>');

                    $(".footer-betslip").removeClass("footer-betslip-normal");
                    $(".footer-betslip").addClass("footer-peakpool");
                } else {
                    $(".footer-betslip").html('<h3 class="error">'+(responseData.reply.message)+'</h3>');
                }
            } catch (e) {
                $(".footer-betslip").html('<h3 class="error">An error has occured, please try again later.</h3>'+e);
            }
        },
        error: function (xhr, status, error) {
            $(".footer-betslip").html('<h3 class="error">Please check your connection and try again.</h3>');
        }
    });
    });
}