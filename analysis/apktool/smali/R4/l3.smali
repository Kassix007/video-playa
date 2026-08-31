.class public final LR4/l3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LR4/k1;

.field public b:LR4/U;

.field public c:LR4/u0;

.field public d:LR4/s0;

.field public final e:Lcom/web2native/OrufyConnectHandlerUtil;

.field public f:LB0/G0;

.field public g:LR4/u0;

.field public h:LR4/r;

.field public i:LR4/V;

.field public j:LR4/V;

.field public final k:Lcom/web2native/MainActivity;

.field public final l:Lcom/web2native/MainActivity;

.field public final m:Landroid/webkit/WebView;

.field public n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public final q:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(LR4/k1;)V
    .locals 4

    .line 1
    const-string v0, "dataObject"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 10
    .line 11
    iget-object v0, p1, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 12
    .line 13
    iput-object v0, p0, LR4/l3;->k:Lcom/web2native/MainActivity;

    .line 14
    .line 15
    iget-object v0, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 16
    .line 17
    iput-object v0, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 18
    .line 19
    const-class v1, LR4/l3;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iput-object v1, p0, LR4/l3;->o:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 28
    .line 29
    iput-object v1, p0, LR4/l3;->m:Landroid/webkit/WebView;

    .line 30
    .line 31
    iget-object v1, p1, LR4/k1;->d:LR4/i;

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    iget-object v1, v1, LR4/i;->m:LR4/G;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    iget-object v1, v1, LR4/G;->a:Ljava/lang/Boolean;

    .line 41
    .line 42
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v1, v2

    .line 50
    :goto_0
    if-eqz v1, :cond_1

    .line 51
    .line 52
    iget-object p1, p1, LR4/k1;->L:Lcom/web2native/OrufyConnectHandlerUtil;

    .line 53
    .line 54
    iput-object p1, p0, LR4/l3;->e:Lcom/web2native/OrufyConnectHandlerUtil;

    .line 55
    .line 56
    :cond_1
    invoke-virtual {v0, v2}, Landroid/app/Activity;->getPreferences(I)Landroid/content/SharedPreferences;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, LR4/l3;->q:Landroid/content/SharedPreferences;

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    const-string v0, "results"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    goto :goto_0

    .line 11
    :catch_0
    const-string v0, "{\"type\":\"RESPONSE_EXCEPTION\"}"

    .line 12
    .line 13
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, LE1/n;

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-direct {v1, p1, v0, p0, v2}, LE1/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final addEventToAppsFlyer(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object p1, p1, LR4/k1;->B:LR4/V;

    .line 4
    .line 5
    return-void
.end method

.method public final addFbEvents(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object p1, p1, LR4/k1;->F:LR4/V;

    .line 4
    .line 5
    return-void
.end method

.method public final addFbPurchaseEvent(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object p1, p1, LR4/k1;->F:LR4/V;

    .line 4
    .line 5
    return-void
.end method

.method public final addToPlayList(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final addTrigger(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final addTriggers(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final askBluetoothPermission()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->i0:LR4/V;

    .line 4
    .line 5
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "blobUrl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "blob"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {p1, v0, v1}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iput-object p2, p0, LR4/l3;->n:Ljava/lang/String;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "javascript: var xhr = new XMLHttpRequest();xhr.open(\'GET\', \'"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p1, "\', true);xhr.setRequestHeader(\'Content-type\',\'"

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, ";charset=UTF-8\');xhr.responseType = \'blob\';xhr.onload = function(e) {    if (this.status == 200) {        var blobPdf = this.response;        var reader = new FileReader();        reader.readAsDataURL(blobPdf);        reader.onloadend = function() {            base64data = reader.result;            WebToNativeInterface.getBase64FromBlobData(base64data);        }    }};xhr.send();"

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_0
    const-string p1, "javascript: console.log(\'It is not a Blob URL\');"

    .line 46
    .line 47
    return-object p1
.end method

.method public final biometricAuthWithDismissOnCancel(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-string p1, ""

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    const-string p1, "prompt"

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move-object p1, v2

    .line 29
    :goto_1
    const-string v1, "isAuthenticationOptional"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    :cond_2
    invoke-virtual {p0}, LR4/l3;->c()V

    .line 46
    .line 47
    .line 48
    new-instance v0, Landroid/os/Handler;

    .line 49
    .line 50
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 55
    .line 56
    .line 57
    new-instance v1, LR4/j3;

    .line 58
    .line 59
    invoke-direct {v1, p0, p1, v2}, LR4/j3;-><init>(LR4/l3;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, LR4/l3;->i:LR4/V;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, LR4/l3;->h:LR4/r;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, LR4/r;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LR4/l3;->h:LR4/r;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 17
    .line 18
    iget-object v1, v0, LR4/k1;->e:LT1/u;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, v1, LT1/u;->b:LW1/j;

    .line 23
    .line 24
    invoke-virtual {v1}, LW1/j;->f()LT1/p;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget-object v1, v1, LT1/p;->r:LW1/l;

    .line 31
    .line 32
    iget-object v1, v1, LW1/l;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v1, 0x0

    .line 38
    :goto_0
    const-string v2, "splashScreen"

    .line 39
    .line 40
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    new-instance v1, LR4/V;

    .line 44
    .line 45
    iget-object v0, v0, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 46
    .line 47
    iget-object v0, p0, LR4/l3;->h:LR4/r;

    .line 48
    .line 49
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, LR4/l3;->i:LR4/V;

    .line 56
    .line 57
    :cond_2
    return-void
.end method

.method public final callBiometric(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    invoke-virtual {p0}, LR4/l3;->c()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, LR4/j3;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, p0, p1, v2}, LR4/j3;-><init>(LR4/l3;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final checkBiometricStatus()V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    invoke-virtual {p0}, LR4/l3;->c()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final checkIfAppUpdateAvailable()V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->I:LB0/o;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, LB0/o;->r:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LY4/d;

    .line 10
    .line 11
    iget-object v1, v0, LY4/d;->e:Lorg/json/JSONObject;

    .line 12
    .line 13
    const-string v2, "type"

    .line 14
    .line 15
    const-string v3, "checkIfAppUpdateAvailable"

    .line 16
    .line 17
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, LY4/d;->g:Ly4/e;

    .line 21
    .line 22
    invoke-virtual {v1}, Ly4/e;->b()LS3/k;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, LY4/b;

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    invoke-direct {v2, v0, v3}, LY4/b;-><init>(LY4/d;I)V

    .line 30
    .line 31
    .line 32
    new-instance v3, LR4/L0;

    .line 33
    .line 34
    const/4 v4, 0x6

    .line 35
    invoke-direct {v3, v4, v2}, LR4/L0;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object v2, LS3/f;->a:LO3/Q0;

    .line 42
    .line 43
    invoke-virtual {v1, v2, v3}, LS3/k;->a(Ljava/util/concurrent/Executor;LS3/c;)LS3/k;

    .line 44
    .line 45
    .line 46
    new-instance v3, LR4/L0;

    .line 47
    .line 48
    const/4 v4, 0x7

    .line 49
    invoke-direct {v3, v4, v0}, LR4/L0;-><init>(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, LS3/h;

    .line 53
    .line 54
    invoke-direct {v0, v2, v3}, LS3/h;-><init>(Ljava/util/concurrent/Executor;LS3/b;)V

    .line 55
    .line 56
    .line 57
    iget-object v2, v1, LS3/k;->b:Lcom/google/android/gms/internal/measurement/O1;

    .line 58
    .line 59
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/measurement/O1;->e(LS3/i;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, LS3/k;->i()V

    .line 63
    .line 64
    .line 65
    :cond_0
    return-void
.end method

.method public final checkPackageName(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final checkPermission(Ljava/lang/String;)V
    .locals 7
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 4
    .line 5
    iget-object v0, v0, LR4/k1;->S:Lg5/h;

    .line 6
    .line 7
    const-string v1, "checkPermission"

    .line 8
    .line 9
    iput-object v1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, v0, Lg5/h;->e:Z

    .line 13
    .line 14
    new-instance v1, Lorg/json/JSONArray;

    .line 15
    .line 16
    invoke-direct {v1, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x0

    .line 29
    move v4, v3

    .line 30
    :goto_0
    if-ge v4, v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    const-string v6, "getString(...)"

    .line 37
    .line 38
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    add-int/lit8 v4, v4, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    .line 48
    .line 49
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    move v4, v3

    .line 57
    :goto_1
    if-ge v4, v2, :cond_1

    .line 58
    .line 59
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    add-int/lit8 v4, v4, 0x1

    .line 64
    .line 65
    check-cast v5, Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v5}, Lg5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v1, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    iget-object p1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const-string v2, "permissionStatus"

    .line 81
    .line 82
    iget-boolean v4, v0, Lg5/h;->e:Z

    .line 83
    .line 84
    if-eqz v4, :cond_3

    .line 85
    .line 86
    new-instance v4, Lorg/json/JSONObject;

    .line 87
    .line 88
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 89
    .line 90
    .line 91
    :try_start_0
    const-string v5, "type"

    .line 92
    .line 93
    invoke-virtual {v4, v5, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :catch_0
    move-exception p1

    .line 101
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 102
    .line 103
    .line 104
    :goto_2
    iget-object p1, v0, Lg5/h;->b:LR4/k1;

    .line 105
    .line 106
    iget-object p1, p1, LR4/k1;->H:LR4/l3;

    .line 107
    .line 108
    if-eqz p1, :cond_2

    .line 109
    .line 110
    invoke-virtual {p1, v4}, LR4/l3;->a(Lorg/json/JSONObject;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    iput-boolean v3, v0, Lg5/h;->e:Z

    .line 114
    .line 115
    const/4 p1, 0x0

    .line 116
    iput-object p1, v0, Lg5/h;->t:Ljava/lang/String;

    .line 117
    .line 118
    iput-object p1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 119
    .line 120
    :cond_3
    return-void
.end method

.method public final clearWebViewCache(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "reload"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    new-instance v2, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 30
    .line 31
    iget-object p1, p1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    new-instance p1, LR4/k3;

    .line 36
    .line 37
    invoke-direct {p1, p0, v1}, LR4/k3;-><init>(LR4/l3;Z)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public final closeApp()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v1, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 6
    .line 7
    .line 8
    iget-object v0, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/app/Activity;->finishAndRemoveTask()V

    .line 11
    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/lang/RuntimeException;

    .line 18
    .line 19
    const-string v1, "System.exit returned normally, while it was supposed to halt JVM."

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public final createWebPagePrint()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LR4/j3;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-direct {v1, p0, v2}, LR4/j3;-><init>(LR4/l3;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final customBackHandling(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    new-instance v0, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string p1, "enable"

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, v0, LR4/k1;->p:Ljava/lang/Boolean;

    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final deleteAppData(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "deleteAppData - "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "NativeDataStoreLog"

    .line 16
    .line 17
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 31
    .line 32
    iget-object p1, p1, LR4/k1;->z:LR4/V;

    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final deleteCloudData(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "deleteCloudData - "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "NativeDataStoreLog"

    .line 16
    .line 17
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 31
    .line 32
    iget-object p1, p1, LR4/k1;->z:LR4/V;

    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final deleteSecret()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    invoke-virtual {p0}, LR4/l3;->c()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, LR4/j3;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-direct {v1, p0, v2}, LR4/j3;-><init>(LR4/l3;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final doneVoiceSearch(Lorg/json/JSONObject;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "results"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, LR4/l3;->a(Lorg/json/JSONObject;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final downloadFile(Ljava/lang/String;)V
    .locals 16
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "jsString"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "jsString : "

    .line 11
    .line 12
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 17
    .line 18
    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v7, LR4/s0;

    .line 22
    .line 23
    iget-object v2, v1, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 24
    .line 25
    iget-object v3, v1, LR4/l3;->a:LR4/k1;

    .line 26
    .line 27
    const/4 v12, 0x0

    .line 28
    invoke-direct {v7, v2, v3, v12}, LR4/s0;-><init>(Lcom/web2native/MainActivity;LR4/k1;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    goto/16 :goto_a

    .line 38
    .line 39
    :cond_0
    const/4 v2, 0x0

    .line 40
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    .line 41
    .line 42
    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    move-exception v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 48
    .line 49
    .line 50
    move-object v3, v2

    .line 51
    :goto_0
    if-nez v3, :cond_1

    .line 52
    .line 53
    goto/16 :goto_a

    .line 54
    .line 55
    :cond_1
    const-string v0, "url"

    .line 56
    .line 57
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_b

    .line 62
    .line 63
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    const-string v0, "fileName"

    .line 68
    .line 69
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    move-object v13, v4

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    move-object v13, v2

    .line 82
    :goto_1
    const-string v4, "isBlob"

    .line 83
    .line 84
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_3

    .line 89
    .line 90
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    goto :goto_2

    .line 95
    :cond_3
    move v4, v12

    .line 96
    :goto_2
    const-string v6, "mimeType"

    .line 97
    .line 98
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_4

    .line 103
    .line 104
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    move-object v14, v6

    .line 109
    goto :goto_3

    .line 110
    :cond_4
    move-object v14, v2

    .line 111
    :goto_3
    const-string v6, "cookies"

    .line 112
    .line 113
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    if-eqz v8, :cond_5

    .line 118
    .line 119
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    move-object v9, v6

    .line 124
    goto :goto_4

    .line 125
    :cond_5
    move-object v9, v2

    .line 126
    :goto_4
    const-string v6, "userAgent"

    .line 127
    .line 128
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    if-eqz v8, :cond_6

    .line 133
    .line 134
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    move-object v10, v6

    .line 139
    goto :goto_5

    .line 140
    :cond_6
    move-object v10, v2

    .line 141
    :goto_5
    const-string v6, "openFileAfterDownload"

    .line 142
    .line 143
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    if-eqz v8, :cond_7

    .line 148
    .line 149
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    goto :goto_6

    .line 154
    :cond_7
    move v3, v12

    .line 155
    :goto_6
    const/4 v15, 0x3

    .line 156
    if-eqz v4, :cond_8

    .line 157
    .line 158
    sget-object v0, LM5/H;->a:LT5/e;

    .line 159
    .line 160
    sget-object v0, LR5/n;->a:LN5/f;

    .line 161
    .line 162
    invoke-static {v0}, LM5/y;->a(Lq5/h;)LR5/d;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    new-instance v4, LR4/p0;

    .line 167
    .line 168
    invoke-direct {v4, v7, v5, v13, v2}, LR4/p0;-><init>(LR4/s0;Ljava/lang/String;Ljava/lang/String;Lq5/c;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v0, v2, v2, v4, v15}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 172
    .line 173
    .line 174
    move-object/from16 p1, v13

    .line 175
    .line 176
    goto :goto_9

    .line 177
    :cond_8
    move-object/from16 p1, v13

    .line 178
    .line 179
    if-nez v13, :cond_9

    .line 180
    .line 181
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 182
    .line 183
    .line 184
    move-result-wide v12

    .line 185
    const-string v4, "download_"

    .line 186
    .line 187
    invoke-static {v4, v12, v13}, LC0/S;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    move-object v6, v4

    .line 192
    goto :goto_7

    .line 193
    :cond_9
    move-object/from16 v6, p1

    .line 194
    .line 195
    :goto_7
    invoke-static {v5}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    if-nez v14, :cond_a

    .line 199
    .line 200
    const-string v4, "application/octet-stream"

    .line 201
    .line 202
    move-object v8, v4

    .line 203
    goto :goto_8

    .line 204
    :cond_a
    move-object v8, v14

    .line 205
    :goto_8
    invoke-static {v6, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    sget-object v0, LM5/H;->a:LT5/e;

    .line 209
    .line 210
    sget-object v0, LT5/d;->q:LT5/d;

    .line 211
    .line 212
    invoke-static {v0}, LM5/y;->a(Lq5/h;)LR5/d;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    new-instance v4, LR4/r0;

    .line 217
    .line 218
    const/4 v11, 0x0

    .line 219
    invoke-direct/range {v4 .. v11}, LR4/r0;-><init>(Ljava/lang/String;Ljava/lang/String;LR4/s0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq5/c;)V

    .line 220
    .line 221
    .line 222
    invoke-static {v0, v2, v2, v4, v15}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 223
    .line 224
    .line 225
    :goto_9
    if-eqz v3, :cond_b

    .line 226
    .line 227
    if-eqz p1, :cond_b

    .line 228
    .line 229
    if-eqz v14, :cond_b

    .line 230
    .line 231
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {v14}, Ljava/lang/String;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    new-instance v3, LR4/j0;

    .line 240
    .line 241
    const/4 v4, 0x0

    .line 242
    invoke-direct {v3, v7, v0, v2, v4}, LR4/j0;-><init>(LR4/s0;Ljava/lang/String;Ljava/lang/String;I)V

    .line 243
    .line 244
    .line 245
    iget-object v0, v7, LR4/s0;->a:Lcom/web2native/MainActivity;

    .line 246
    .line 247
    invoke-virtual {v0, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 248
    .line 249
    .line 250
    :cond_b
    :goto_a
    return-void
.end method

.method public final enableSwipeRefresh(Z)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->t:Lj5/d;

    .line 4
    .line 5
    iget-object v0, v0, Lj5/d;->j:LP5/S;

    .line 6
    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1, p1}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final firstCallWhenAppStarted()V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    new-instance v1, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    const-string v2, "type"

    .line 9
    .line 10
    const-string v3, "firstCallWhenAppStarted"

    .line 11
    .line 12
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 13
    .line 14
    .line 15
    const-string v2, "result"

    .line 16
    .line 17
    iget-boolean v3, v0, LR4/k1;->X:Z

    .line 18
    .line 19
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, LR4/l3;->a(Lorg/json/JSONObject;)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    iput-boolean v1, v0, LR4/k1;->X:Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    return-void

    .line 29
    :catch_0
    move-exception v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final forceUpdateCookies()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->flush()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final getAddOnStatus(Ljava/lang/String;)V
    .locals 6
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 4
    .line 5
    if-eqz v1, :cond_1f

    .line 6
    .line 7
    iget-object v0, v0, LR4/k1;->H:LR4/l3;

    .line 8
    .line 9
    if-eqz v0, :cond_1f

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_1f

    .line 15
    .line 16
    new-instance v2, Lorg/json/JSONObject;

    .line 17
    .line 18
    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p1, "addOnName"

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_1f

    .line 28
    .line 29
    invoke-virtual {v2, p1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-lez v2, :cond_1f

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    const/4 v3, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v5, 0x1

    .line 50
    sparse-switch v2, :sswitch_data_0

    .line 51
    .line 52
    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :sswitch_0
    const-string v1, "BACKGROUND_LOCATION"

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_0

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_0
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :sswitch_1
    const-string v2, "SOCIAL_LOGIN"

    .line 70
    .line 71
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-nez v2, :cond_1

    .line 76
    .line 77
    goto/16 :goto_0

    .line 78
    .line 79
    :cond_1
    iget-object v1, v1, LR4/i;->N:LR4/P0;

    .line 80
    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    iget-object v4, v1, LR4/P0;->b:Ljava/lang/String;

    .line 84
    .line 85
    :cond_2
    if-nez v4, :cond_3

    .line 86
    .line 87
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    invoke-static {p1, v5, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :sswitch_2
    const-string v1, "IN_APP_PURCHASE"

    .line 96
    .line 97
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-nez v1, :cond_4

    .line 102
    .line 103
    goto/16 :goto_0

    .line 104
    .line 105
    :cond_4
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :sswitch_3
    const-string v1, "AUTO_READ_SMS"

    .line 110
    .line 111
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_5

    .line 116
    .line 117
    goto/16 :goto_0

    .line 118
    .line 119
    :cond_5
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :sswitch_4
    const-string v2, "APP_SHORTCUTS"

    .line 124
    .line 125
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-nez v2, :cond_6

    .line 130
    .line 131
    goto/16 :goto_0

    .line 132
    .line 133
    :cond_6
    iget-object v1, v1, LR4/i;->j:Ljava/util/List;

    .line 134
    .line 135
    if-eqz v1, :cond_7

    .line 136
    .line 137
    invoke-static {p1, v5, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_7
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :sswitch_5
    const-string v2, "BIOMETRIC_AUTHENTICATION"

    .line 146
    .line 147
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-nez v2, :cond_8

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :cond_8
    iget-object v1, v1, LR4/i;->q:LR4/q;

    .line 156
    .line 157
    if-eqz v1, :cond_9

    .line 158
    .line 159
    iget-object v4, v1, LR4/q;->a:Ljava/lang/Boolean;

    .line 160
    .line 161
    :cond_9
    if-eqz v4, :cond_a

    .line 162
    .line 163
    iget-object v1, v1, LR4/q;->a:Ljava/lang/Boolean;

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    invoke-static {p1, v1, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_a
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :sswitch_6
    const-string v1, "ONESIGNAL"

    .line 178
    .line 179
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-nez v1, :cond_b

    .line 184
    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :cond_b
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :sswitch_7
    const-string v1, "APPSFLYER"

    .line 192
    .line 193
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-nez v1, :cond_c

    .line 198
    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :cond_c
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :sswitch_8
    const-string v2, "OFFER_CARD"

    .line 206
    .line 207
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-nez v2, :cond_d

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_d
    iget-object v1, v1, LR4/i;->o:LR4/L1;

    .line 216
    .line 217
    if-eqz v1, :cond_e

    .line 218
    .line 219
    iget-object v4, v1, LR4/L1;->a:Ljava/lang/Boolean;

    .line 220
    .line 221
    :cond_e
    if-eqz v4, :cond_f

    .line 222
    .line 223
    iget-object v1, v1, LR4/L1;->a:Ljava/lang/Boolean;

    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-eqz v1, :cond_f

    .line 230
    .line 231
    invoke-static {p1, v5, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :cond_f
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :sswitch_9
    const-string v1, "BACKGROUND_APP_AS_A_SERVICE"

    .line 240
    .line 241
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    if-nez v1, :cond_10

    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_10
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 250
    .line 251
    .line 252
    return-void

    .line 253
    :sswitch_a
    const-string v1, "FACEBOOK_APP_EVENTS"

    .line 254
    .line 255
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-nez v1, :cond_11

    .line 260
    .line 261
    goto/16 :goto_0

    .line 262
    .line 263
    :cond_11
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :sswitch_b
    const-string v2, "ONBOARDING_SCREEN"

    .line 268
    .line 269
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v2

    .line 273
    if-nez v2, :cond_12

    .line 274
    .line 275
    goto/16 :goto_0

    .line 276
    .line 277
    :cond_12
    iget-object v1, v1, LR4/i;->a:LR4/O1;

    .line 278
    .line 279
    if-eqz v1, :cond_13

    .line 280
    .line 281
    invoke-static {p1, v5, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :cond_13
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :sswitch_c
    const-string v2, "FLOATING_BUTTON"

    .line 290
    .line 291
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    if-nez v2, :cond_14

    .line 296
    .line 297
    goto/16 :goto_0

    .line 298
    .line 299
    :cond_14
    iget-object v1, v1, LR4/i;->i:Ljava/util/List;

    .line 300
    .line 301
    if-eqz v1, :cond_15

    .line 302
    .line 303
    invoke-static {p1, v5, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :cond_15
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 308
    .line 309
    .line 310
    return-void

    .line 311
    :sswitch_d
    const-string v2, "BOTTOM_NAVIGATION"

    .line 312
    .line 313
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    if-nez v2, :cond_16

    .line 318
    .line 319
    goto :goto_0

    .line 320
    :cond_16
    iget-object v1, v1, LR4/i;->e:LR4/J2;

    .line 321
    .line 322
    if-eqz v1, :cond_17

    .line 323
    .line 324
    iget-object v4, v1, LR4/J2;->a:Ljava/lang/Boolean;

    .line 325
    .line 326
    :cond_17
    if-eqz v4, :cond_18

    .line 327
    .line 328
    iget-object v1, v1, LR4/J2;->a:Ljava/lang/Boolean;

    .line 329
    .line 330
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 331
    .line 332
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v1

    .line 336
    if-eqz v1, :cond_18

    .line 337
    .line 338
    invoke-static {p1, v5, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 339
    .line 340
    .line 341
    return-void

    .line 342
    :cond_18
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 343
    .line 344
    .line 345
    return-void

    .line 346
    :sswitch_e
    const-string v2, "SECONDARY_NAVIGATION"

    .line 347
    .line 348
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    if-nez v2, :cond_19

    .line 353
    .line 354
    goto :goto_0

    .line 355
    :cond_19
    iget-object v1, v1, LR4/i;->n:LR4/w2;

    .line 356
    .line 357
    if-eqz v1, :cond_1a

    .line 358
    .line 359
    invoke-static {p1, v5, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 360
    .line 361
    .line 362
    return-void

    .line 363
    :cond_1a
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 364
    .line 365
    .line 366
    return-void

    .line 367
    :sswitch_f
    const-string v1, "IN_APP_UPDATE"

    .line 368
    .line 369
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    if-nez v1, :cond_1b

    .line 374
    .line 375
    goto :goto_0

    .line 376
    :cond_1b
    invoke-static {p1, v5, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 377
    .line 378
    .line 379
    return-void

    .line 380
    :sswitch_10
    const-string v1, "IN_APP_REVIEW"

    .line 381
    .line 382
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    if-nez v1, :cond_1c

    .line 387
    .line 388
    goto :goto_0

    .line 389
    :cond_1c
    invoke-static {p1, v5, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :sswitch_11
    const-string v1, "CUSTOM_MEDIA_PLAYER"

    .line 394
    .line 395
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    if-nez v1, :cond_1d

    .line 400
    .line 401
    goto :goto_0

    .line 402
    :cond_1d
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 403
    .line 404
    .line 405
    return-void

    .line 406
    :sswitch_12
    const-string v1, "BARCODE_SCANNING"

    .line 407
    .line 408
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    if-nez v1, :cond_1e

    .line 413
    .line 414
    goto :goto_0

    .line 415
    :cond_1e
    invoke-static {p1, v3, v0}, Ln5/A;->z(Ljava/lang/String;ZLR4/l3;)V

    .line 416
    .line 417
    .line 418
    :cond_1f
    :goto_0
    return-void

    .line 419
    :sswitch_data_0
    .sparse-switch
        -0x7ef98e50 -> :sswitch_12
        -0x64772636 -> :sswitch_11
        -0x5fec1550 -> :sswitch_10
        -0x5a3ad3df -> :sswitch_f
        -0x4f6e9221 -> :sswitch_e
        -0x47c03b58 -> :sswitch_d
        -0x3a70d275 -> :sswitch_c
        -0x180df4f0 -> :sswitch_b
        -0x8cc4bd0 -> :sswitch_a
        0x1971ed39 -> :sswitch_9
        0x28480f33 -> :sswitch_8
        0x3551450e -> :sswitch_7
        0x3b90486e -> :sswitch_6
        0x48c9d4ff -> :sswitch_5
        0x52bee80f -> :sswitch_4
        0x5b5e57a0 -> :sswitch_3
        0x623e7e59 -> :sswitch_2
        0x62de5ff7 -> :sswitch_1
        0x7503f3a6 -> :sswitch_0
    .end sparse-switch
.end method

.method public final getAll()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->j:LR4/V;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LR4/V;

    .line 6
    .line 7
    iget-object v1, p0, LR4/l3;->a:LR4/k1;

    .line 8
    .line 9
    invoke-direct {v0, v1}, LR4/V;-><init>(LR4/k1;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LR4/l3;->j:LR4/V;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final getAllPurchases(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final getAndroidVersion()I
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    return v0

    .line 4
    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0
.end method

.method public final getAppData(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "getAppData - "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "NativeDataStoreLog"

    .line 16
    .line 17
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 31
    .line 32
    iget-object p1, p1, LR4/k1;->z:LR4/V;

    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final getBase64FromBlobData(Ljava/lang/String;)V
    .locals 16
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v3, ""

    .line 6
    .line 7
    const-string v0, "base64Data"

    .line 8
    .line 9
    invoke-static {v2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ljava/text/DateFormat;->getDateTimeInstance()Ljava/text/DateFormat;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v4, Ljava/util/Date;

    .line 17
    .line 18
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const-string v4, "pattern"

    .line 29
    .line 30
    const-string v5, ", "

    .line 31
    .line 32
    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    const-string v6, "compile(...)"

    .line 37
    .line 38
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v5, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v5, "_"

    .line 46
    .line 47
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v7, "replaceFirst(...)"

    .line 52
    .line 53
    invoke-static {v0, v7}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v8, " "

    .line 57
    .line 58
    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-static {v8, v6}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v8, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0, v5}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v5, "replaceAll(...)"

    .line 74
    .line 75
    invoke-static {v0, v5}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v8, ":"

    .line 79
    .line 80
    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-static {v8, v6}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const-string v9, "-"

    .line 88
    .line 89
    invoke-virtual {v8, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0, v9}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v0, v5}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget-object v8, v1, LR4/l3;->n:Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v5, v8}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    iget-object v8, v1, LR4/l3;->a:LR4/k1;

    .line 111
    .line 112
    iget-object v9, v8, LR4/k1;->d:LR4/i;

    .line 113
    .line 114
    if-eqz v9, :cond_0

    .line 115
    .line 116
    iget-object v9, v9, LR4/i;->z:LR4/Y;

    .line 117
    .line 118
    if-eqz v9, :cond_0

    .line 119
    .line 120
    iget-object v9, v9, LR4/Y;->a:Ljava/lang/Boolean;

    .line 121
    .line 122
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 123
    .line 124
    invoke-static {v9, v11}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    goto :goto_0

    .line 129
    :cond_0
    const/4 v9, 0x0

    .line 130
    :goto_0
    const-string v11, "_."

    .line 131
    .line 132
    const-string v12, "/"

    .line 133
    .line 134
    iget-object v13, v1, LR4/l3;->k:Lcom/web2native/MainActivity;

    .line 135
    .line 136
    if-eqz v9, :cond_1

    .line 137
    .line 138
    new-instance v9, Ljava/io/File;

    .line 139
    .line 140
    sget-object v14, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 141
    .line 142
    iget-object v15, v8, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 143
    .line 144
    invoke-virtual {v15}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 145
    .line 146
    .line 147
    move-result-object v15

    .line 148
    invoke-virtual {v13}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    invoke-virtual {v15, v10}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    new-instance v15, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    invoke-static {v10}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    new-instance v14, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_1
    new-instance v9, Ljava/io/File;

    .line 207
    .line 208
    sget-object v10, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {v10}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    new-instance v14, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    :goto_1
    iget-object v0, v1, LR4/l3;->n:Ljava/lang/String;

    .line 242
    .line 243
    const-string v10, "^data:"

    .line 244
    .line 245
    const-string v11, ";base64,"

    .line 246
    .line 247
    invoke-static {v10, v0, v11}, LC0/S;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    const/4 v11, 0x1

    .line 252
    :try_start_0
    invoke-static {v10, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-static {v10}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-static {v0, v6}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-static {v0, v7}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    const/4 v4, 0x0

    .line 274
    invoke-static {v0, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 275
    .line 276
    .line 277
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 278
    goto :goto_2

    .line 279
    :catch_0
    move-exception v0

    .line 280
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v10, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    const-string v4, "substring(...)"

    .line 288
    .line 289
    invoke-static {v0, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    invoke-static {v2, v0, v3}, LJ5/t;->E0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    const/4 v4, 0x0

    .line 297
    invoke-static {v0, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    :goto_2
    if-nez v0, :cond_2

    .line 302
    .line 303
    goto/16 :goto_d

    .line 304
    .line 305
    :cond_2
    const/4 v2, 0x0

    .line 306
    :try_start_1
    new-instance v3, Ljava/io/FileOutputStream;

    .line 307
    .line 308
    invoke-direct {v3, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v3, v0}, Ljava/io/FileOutputStream;->write([B)V

    .line 312
    .line 313
    .line 314
    if-eqz v5, :cond_3

    .line 315
    .line 316
    const-string v0, "jpg"

    .line 317
    .line 318
    invoke-static {v5, v0}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 319
    .line 320
    .line 321
    move-result v0

    .line 322
    if-ne v0, v11, :cond_3

    .line 323
    .line 324
    move v0, v11

    .line 325
    goto :goto_3

    .line 326
    :cond_3
    const/4 v0, 0x0

    .line 327
    goto :goto_3

    .line 328
    :catch_1
    move-exception v0

    .line 329
    goto :goto_5

    .line 330
    :goto_3
    if-nez v0, :cond_5

    .line 331
    .line 332
    if-eqz v5, :cond_4

    .line 333
    .line 334
    const-string v0, "png"

    .line 335
    .line 336
    invoke-static {v5, v0}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-ne v0, v11, :cond_4

    .line 341
    .line 342
    move v0, v11

    .line 343
    goto :goto_4

    .line 344
    :cond_4
    const/4 v0, 0x0

    .line 345
    :goto_4
    if-eqz v0, :cond_6

    .line 346
    .line 347
    :cond_5
    invoke-virtual {v9}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    const-string v4, "getPath(...)"

    .line 352
    .line 353
    invoke-static {v0, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    filled-new-array {v0}, [Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    new-instance v4, LR4/l0;

    .line 361
    .line 362
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 363
    .line 364
    .line 365
    invoke-static {v13, v0, v2, v4}, Landroid/media/MediaScannerConnection;->scanFile(Landroid/content/Context;[Ljava/lang/String;[Ljava/lang/String;Landroid/media/MediaScannerConnection$OnScanCompletedListener;)V

    .line 366
    .line 367
    .line 368
    :cond_6
    invoke-virtual {v3}, Ljava/io/OutputStream;->flush()V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 372
    .line 373
    .line 374
    goto :goto_6

    .line 375
    :goto_5
    const-string v3, "FAILED TO DOWNLOAD THE FILE!"

    .line 376
    .line 377
    const/4 v4, 0x0

    .line 378
    invoke-static {v13, v3, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    invoke-virtual {v3}, Landroid/widget/Toast;->show()V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 386
    .line 387
    .line 388
    :goto_6
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    const-string v3, ".provider"

    .line 393
    .line 394
    if-eqz v0, :cond_8

    .line 395
    .line 396
    new-instance v0, Landroid/content/Intent;

    .line 397
    .line 398
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 399
    .line 400
    .line 401
    const-string v4, "android.intent.action.VIEW"

    .line 402
    .line 403
    invoke-virtual {v0, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    new-instance v6, Ljava/lang/StringBuilder;

    .line 415
    .line 416
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    invoke-static {v13, v4, v9}, Landroidx/core/content/FileProvider;->d(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 430
    .line 431
    .line 432
    move-result-object v4

    .line 433
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 434
    .line 435
    .line 436
    move-result-object v6

    .line 437
    invoke-virtual {v6, v5}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v6

    .line 441
    invoke-virtual {v0, v4, v6}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v11}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 445
    .line 446
    .line 447
    const/high16 v4, 0x4000000

    .line 448
    .line 449
    invoke-static {v13, v11, v0, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    const-string v4, "notification"

    .line 454
    .line 455
    invoke-virtual {v13, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v4

    .line 459
    const-string v6, "null cannot be cast to non-null type android.app.NotificationManager"

    .line 460
    .line 461
    invoke-static {v4, v6}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    check-cast v4, Landroid/app/NotificationManager;

    .line 465
    .line 466
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 467
    .line 468
    const/16 v7, 0x1a

    .line 469
    .line 470
    const v10, 0x7f070103

    .line 471
    .line 472
    .line 473
    const-string v12, "File downloaded"

    .line 474
    .line 475
    const-string v14, "You have got something new!"

    .line 476
    .line 477
    if-lt v6, v7, :cond_7

    .line 478
    .line 479
    invoke-static {}, LC0/U;->m()V

    .line 480
    .line 481
    .line 482
    invoke-static {}, LC0/U;->c()Landroid/app/NotificationChannel;

    .line 483
    .line 484
    .line 485
    move-result-object v6

    .line 486
    new-instance v7, Landroid/app/Notification$Builder;

    .line 487
    .line 488
    invoke-static {v13}, LC0/U;->b(Lcom/web2native/MainActivity;)Landroid/app/Notification$Builder;

    .line 489
    .line 490
    .line 491
    move-result-object v7

    .line 492
    invoke-virtual {v7, v14}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 493
    .line 494
    .line 495
    move-result-object v7

    .line 496
    invoke-virtual {v7, v12}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 497
    .line 498
    .line 499
    move-result-object v7

    .line 500
    invoke-virtual {v7, v0}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    invoke-static {v0}, LC0/U;->a(Landroid/app/Notification$Builder;)Landroid/app/Notification$Builder;

    .line 505
    .line 506
    .line 507
    move-result-object v0

    .line 508
    invoke-virtual {v0, v10}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    const-string v7, "build(...)"

    .line 517
    .line 518
    invoke-static {v0, v7}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    invoke-static {v4, v6}, LC0/U;->o(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v4, v11, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 525
    .line 526
    .line 527
    goto :goto_7

    .line 528
    :cond_7
    new-instance v0, Lk1/h;

    .line 529
    .line 530
    const-string v6, "MYCHANNEL"

    .line 531
    .line 532
    invoke-direct {v0, v13, v6}, Lk1/h;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    iget-object v6, v0, Lk1/h;->o:Landroid/app/Notification;

    .line 536
    .line 537
    const/4 v7, -0x1

    .line 538
    iput v7, v6, Landroid/app/Notification;->defaults:I

    .line 539
    .line 540
    iget v7, v6, Landroid/app/Notification;->flags:I

    .line 541
    .line 542
    or-int/2addr v7, v11

    .line 543
    iput v7, v6, Landroid/app/Notification;->flags:I

    .line 544
    .line 545
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 546
    .line 547
    .line 548
    move-result-wide v6

    .line 549
    iget-object v15, v0, Lk1/h;->o:Landroid/app/Notification;

    .line 550
    .line 551
    iput-wide v6, v15, Landroid/app/Notification;->when:J

    .line 552
    .line 553
    iput v10, v15, Landroid/app/Notification;->icon:I

    .line 554
    .line 555
    invoke-static {v12}, Lk1/h;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 556
    .line 557
    .line 558
    move-result-object v6

    .line 559
    iput-object v6, v0, Lk1/h;->e:Ljava/lang/CharSequence;

    .line 560
    .line 561
    invoke-static {v14}, Lk1/h;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    iput-object v6, v0, Lk1/h;->f:Ljava/lang/CharSequence;

    .line 566
    .line 567
    invoke-virtual {v0}, Lk1/h;->a()Landroid/app/Notification;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    invoke-virtual {v4, v11, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 572
    .line 573
    .line 574
    new-instance v0, Landroid/os/Handler;

    .line 575
    .line 576
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 577
    .line 578
    .line 579
    move-result-object v6

    .line 580
    invoke-direct {v0, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 581
    .line 582
    .line 583
    new-instance v6, LC0/m;

    .line 584
    .line 585
    const/4 v7, 0x6

    .line 586
    invoke-direct {v6, v7, v4}, LC0/m;-><init>(ILjava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    const-wide/16 v14, 0x3e8

    .line 590
    .line 591
    invoke-virtual {v0, v6, v14, v15}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 592
    .line 593
    .line 594
    :cond_8
    :goto_7
    iget-object v0, v8, LR4/k1;->H:LR4/l3;

    .line 595
    .line 596
    if-eqz v0, :cond_9

    .line 597
    .line 598
    iget-object v0, v0, LR4/l3;->p:Ljava/lang/String;

    .line 599
    .line 600
    goto :goto_8

    .line 601
    :cond_9
    move-object v0, v2

    .line 602
    :goto_8
    if-eqz v0, :cond_d

    .line 603
    .line 604
    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    new-instance v4, Ljava/lang/StringBuilder;

    .line 613
    .line 614
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v0

    .line 627
    invoke-static {v13, v0, v9}, Landroidx/core/content/FileProvider;->d(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    .line 628
    .line 629
    .line 630
    move-result-object v0

    .line 631
    iget-object v3, v8, LR4/k1;->H:LR4/l3;

    .line 632
    .line 633
    if-eqz v3, :cond_a

    .line 634
    .line 635
    iget-object v3, v3, LR4/l3;->p:Ljava/lang/String;

    .line 636
    .line 637
    goto :goto_9

    .line 638
    :cond_a
    move-object v3, v2

    .line 639
    :goto_9
    invoke-static {v3}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 643
    .line 644
    .line 645
    :try_start_2
    new-instance v4, Landroid/content/Intent;

    .line 646
    .line 647
    const-string v6, "android.intent.action.SEND"

    .line 648
    .line 649
    invoke-direct {v4, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    invoke-static {v3}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 653
    .line 654
    .line 655
    move-result v6

    .line 656
    if-nez v6, :cond_b

    .line 657
    .line 658
    const-string v6, "android.intent.extra.TEXT"

    .line 659
    .line 660
    invoke-virtual {v4, v6, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 661
    .line 662
    .line 663
    goto :goto_a

    .line 664
    :catch_2
    move-exception v0

    .line 665
    goto :goto_b

    .line 666
    :cond_b
    :goto_a
    const-string v3, "android.intent.extra.STREAM"

    .line 667
    .line 668
    invoke-virtual {v4, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 669
    .line 670
    .line 671
    if-nez v5, :cond_c

    .line 672
    .line 673
    const-string v5, "*/*"

    .line 674
    .line 675
    :cond_c
    invoke-static {v5}, LD5/a;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    invoke-virtual {v4, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v4, v11}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 683
    .line 684
    .line 685
    const/high16 v0, 0x10000000

    .line 686
    .line 687
    invoke-virtual {v4, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 688
    .line 689
    .line 690
    const-string v0, "Share File"

    .line 691
    .line 692
    invoke-static {v4, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 693
    .line 694
    .line 695
    move-result-object v0

    .line 696
    invoke-virtual {v13, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 697
    .line 698
    .line 699
    goto :goto_c

    .line 700
    :goto_b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 701
    .line 702
    const-string v4, "the error is "

    .line 703
    .line 704
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 715
    .line 716
    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    :goto_c
    iget-object v0, v8, LR4/k1;->H:LR4/l3;

    .line 720
    .line 721
    if-eqz v0, :cond_e

    .line 722
    .line 723
    iput-object v2, v0, LR4/l3;->p:Ljava/lang/String;

    .line 724
    .line 725
    goto :goto_d

    .line 726
    :cond_d
    const-string v0, "FILE DOWNLOADED!"

    .line 727
    .line 728
    const/4 v4, 0x0

    .line 729
    invoke-static {v13, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 734
    .line 735
    .line 736
    :cond_e
    :goto_d
    return-void
.end method

.method public final getCloudData(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "getCloudData - "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "NativeDataStoreLog"

    .line 16
    .line 17
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 31
    .line 32
    iget-object p1, p1, LR4/k1;->z:LR4/V;

    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final getDeviceInfo()V
    .locals 7
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 4
    .line 5
    new-instance v1, Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "appId"

    .line 15
    .line 16
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    const-string v3, "platform"

    .line 20
    .line 21
    const-string v4, "android"

    .line 22
    .line 23
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    const-string v3, "language"

    .line 27
    .line 28
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    const-string v3, "os"

    .line 40
    .line 41
    const-string v4, "Android"

    .line 42
    .line 43
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    const-string v3, "osVersion"

    .line 47
    .line 48
    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    const-string v3, "model"

    .line 54
    .line 55
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 56
    .line 57
    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 58
    .line 59
    new-instance v6, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v4, " "

    .line 68
    .line 69
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    const-string v3, "hardware"

    .line 83
    .line 84
    sget-object v4, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    const-string v3, "timeZone"

    .line 90
    .line 91
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v4}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    const/4 v4, 0x0

    .line 107
    :try_start_0
    invoke-virtual {v3, v2, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    const-string v5, "appVersion"

    .line 112
    .line 113
    iget-object v6, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    const-string v5, "appVersionCode"

    .line 119
    .line 120
    iget v4, v4, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 121
    .line 122
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :catch_0
    move-exception v4

    .line 131
    const-string v5, "MainActivity"

    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    invoke-static {v5, v6, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 138
    .line 139
    .line 140
    :goto_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    iget v4, v4, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 145
    .line 146
    and-int/lit8 v4, v4, 0x2

    .line 147
    .line 148
    if-eqz v4, :cond_0

    .line 149
    .line 150
    const-string v2, "debug"

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_0
    invoke-virtual {v3, v2}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    if-nez v2, :cond_1

    .line 158
    .line 159
    const-string v2, "adhoc"

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_1
    const-string v3, "com.google.market"

    .line 163
    .line 164
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-eqz v3, :cond_2

    .line 169
    .line 170
    const-string v2, "playstore"

    .line 171
    .line 172
    :cond_2
    :goto_1
    const-string v3, "installationType"

    .line 173
    .line 174
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    :try_start_1
    const-string v2, "phone"

    .line 178
    .line 179
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    const-string v3, "null cannot be cast to non-null type android.telephony.TelephonyManager"

    .line 184
    .line 185
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 189
    .line 190
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_1

    .line 194
    goto :goto_2

    .line 195
    :catch_1
    move-exception v2

    .line 196
    const-string v3, "MainActivity"

    .line 197
    .line 198
    const-string v4, "Could not fetch operator"

    .line 199
    .line 200
    invoke-static {v3, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 201
    .line 202
    .line 203
    const/4 v2, 0x0

    .line 204
    :goto_2
    if-eqz v2, :cond_3

    .line 205
    .line 206
    const-string v3, "operator"

    .line 207
    .line 208
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    :cond_3
    const-string v2, "installationId"

    .line 212
    .line 213
    sget-object v3, LR4/V;->a:LR4/V;

    .line 214
    .line 215
    monitor-enter v3

    .line 216
    :try_start_2
    sget-object v4, LR4/V;->b:Ljava/lang/String;

    .line 217
    .line 218
    if-nez v4, :cond_5

    .line 219
    .line 220
    new-instance v4, Ljava/io/File;

    .line 221
    .line 222
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    const-string v5, "INSTALLATION"

    .line 227
    .line 228
    invoke-direct {v4, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 229
    .line 230
    .line 231
    :try_start_3
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-nez v0, :cond_4

    .line 236
    .line 237
    invoke-static {v4}, LR4/V;->j(Ljava/io/File;)V

    .line 238
    .line 239
    .line 240
    goto :goto_3

    .line 241
    :catchall_0
    move-exception v0

    .line 242
    goto :goto_7

    .line 243
    :catch_2
    move-exception v0

    .line 244
    goto :goto_4

    .line 245
    :cond_4
    :goto_3
    invoke-static {v4}, LR4/V;->i(Ljava/io/File;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    sput-object v0, LR4/V;->b:Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 250
    .line 251
    goto :goto_5

    .line 252
    :goto_4
    :try_start_4
    new-instance v1, Ljava/lang/RuntimeException;

    .line 253
    .line 254
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 255
    .line 256
    .line 257
    throw v1

    .line 258
    :cond_5
    :goto_5
    sget-object v0, LR4/V;->b:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 259
    .line 260
    monitor-exit v3

    .line 261
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    new-instance v0, Lorg/json/JSONObject;

    .line 265
    .line 266
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 267
    .line 268
    .line 269
    :try_start_5
    const-string v1, "reqType"

    .line 270
    .line 271
    const-string v2, "deviceInfo"

    .line 272
    .line 273
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 274
    .line 275
    .line 276
    const-string v1, "isSuccess"

    .line 277
    .line 278
    const/4 v2, 0x1

    .line 279
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_3

    .line 280
    .line 281
    .line 282
    goto :goto_6

    .line 283
    :catch_3
    move-exception v1

    .line 284
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 285
    .line 286
    .line 287
    :goto_6
    invoke-virtual {p0, v0}, LR4/l3;->a(Lorg/json/JSONObject;)V

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :goto_7
    :try_start_6
    monitor-exit v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 292
    throw v0
.end method

.method public final getOneSignalId()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getPermissionStatus()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->j:LR4/V;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LR4/V;

    .line 6
    .line 7
    iget-object v1, p0, LR4/l3;->a:LR4/k1;

    .line 8
    .line 9
    invoke-direct {v0, v1}, LR4/V;-><init>(LR4/k1;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LR4/l3;->j:LR4/V;

    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final getPlayerStatus()V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final getRegistrationToken()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, LR4/j3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LR4/j3;-><init>(LR4/l3;I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final getText()V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->f:LB0/G0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 6
    .line 7
    iget-object v1, v0, LR4/k1;->H:LR4/l3;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v1, LB0/G0;

    .line 12
    .line 13
    iget-object v2, p0, LR4/l3;->k:Lcom/web2native/MainActivity;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "getApplicationContext(...)"

    .line 20
    .line 21
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, LR4/k1;->H:LR4/l3;

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, v2, v0}, LB0/G0;-><init>(Landroid/content/Context;LR4/l3;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, LR4/l3;->f:LB0/G0;

    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, LR4/l3;->f:LB0/G0;

    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object v1, v0, LB0/G0;->t:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Landroid/content/ClipboardManager;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-virtual {v1, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    const/4 v1, 0x0

    .line 68
    :goto_0
    new-instance v2, Lorg/json/JSONObject;

    .line 69
    .line 70
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v3, "type"

    .line 74
    .line 75
    const-string v4, "CLIPBOARD_CONTENT"

    .line 76
    .line 77
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    const-string v3, "value"

    .line 81
    .line 82
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 83
    .line 84
    .line 85
    iget-object v0, v0, LB0/G0;->s:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, LR4/l3;

    .line 88
    .line 89
    invoke-virtual {v0, v2}, LR4/l3;->a(Lorg/json/JSONObject;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    return-void
.end method

.method public final getTriggerValueForKey(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final getTriggers()V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final hideFloatingButton()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->t:Lj5/d;

    .line 4
    .line 5
    iget-object v0, v0, Lj5/d;->h:LP5/S;

    .line 6
    .line 7
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2, v1}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final hideLoader()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, LR4/j3;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, LR4/j3;-><init>(LR4/l3;I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final hideSplashScreen()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->t:Lj5/d;

    .line 4
    .line 5
    iget-object v0, v0, Lj5/d;->d:LP5/S;

    .line 6
    .line 7
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2, v1}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final inAppPurchase(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final initBeaconData(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 4
    .line 5
    iget-object p1, p1, LR4/k1;->l0:LR4/V;

    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method public final isLocationServiceEnabled()V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LR4/l3;->a:LR4/k1;

    .line 7
    .line 8
    iget-object v1, v1, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 9
    .line 10
    invoke-static {v1}, Ll6/d;->u(Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    :try_start_0
    const-string v2, "type"

    .line 15
    .line 16
    const-string v3, "isDeviceGPSEnabled"

    .line 17
    .line 18
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    const-string v2, "value"

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {p0, v0}, LR4/l3;->a(Lorg/json/JSONObject;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final keepScreenNormal()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->g:LR4/u0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LR4/j3;

    .line 6
    .line 7
    const/4 v1, 0x7

    .line 8
    invoke-direct {v0, p0, v1}, LR4/j3;-><init>(LR4/l3;I)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final keepScreenOn()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, LR4/u0;

    .line 2
    .line 3
    iget-object v1, p0, LR4/l3;->a:LR4/k1;

    .line 4
    .line 5
    iget-object v1, v1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 6
    .line 7
    invoke-direct {v0, v1}, LR4/u0;-><init>(Lcom/web2native/MainActivity;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LR4/l3;->g:LR4/u0;

    .line 11
    .line 12
    new-instance v0, LR4/j3;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-direct {v0, p0, v2}, LR4/j3;-><init>(LR4/l3;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final logFirebaseEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->C:Lk3/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lk3/c;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lk3/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-static {p2}, LE3/h;->G(Ljava/lang/String;)Landroid/os/Bundle;

    .line 15
    .line 16
    .line 17
    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception p2

    .line 20
    const-string v1, "EXCEPTIONS"

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {v1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    :goto_0
    if-eqz p1, :cond_0

    .line 31
    .line 32
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/analytics/FirebaseAnalytics;->logEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public final logFirebaseScreenView(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->C:Lk3/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lk3/c;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lk3/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "screen_name"

    .line 20
    .line 21
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string p1, "screen_class"

    .line 25
    .line 26
    invoke-virtual {v1, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    const-string p2, "screen_view"

    .line 36
    .line 37
    invoke-virtual {p1, p2, v1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->logEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public final login(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, LR4/i;->m:LR4/G;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, LR4/G;->a:Ljava/lang/Boolean;

    .line 12
    .line 13
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, LR4/l3;->e:Lcom/web2native/OrufyConnectHandlerUtil;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/web2native/OrufyConnectHandlerUtil;->login(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final loginWithFacebook()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->F:LR4/V;

    .line 4
    .line 5
    return-void
.end method

.method public final logout()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, LR4/i;->m:LR4/G;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, LR4/G;->a:Ljava/lang/Boolean;

    .line 12
    .line 13
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, LR4/l3;->e:Lcom/web2native/OrufyConnectHandlerUtil;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/web2native/OrufyConnectHandlerUtil;->logout()V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final logoutEmail(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final logoutSMSNumber(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final logoutWithFacebook()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->F:LR4/V;

    .line 4
    .line 5
    return-void
.end method

.method public final makeTapToPayStripePayment(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v1, v1, LR4/i;->F:LR4/P2;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v1, LR4/P2;->a:Ljava/lang/Boolean;

    .line 13
    .line 14
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    if-eqz v1, :cond_4

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_2

    .line 31
    .line 32
    :cond_1
    const/4 v2, 0x1

    .line 33
    :cond_2
    if-nez v2, :cond_4

    .line 34
    .line 35
    iget-object p1, v0, LR4/k1;->S:Lg5/h;

    .line 36
    .line 37
    iget-object p1, p1, Lg5/h;->a:Lcom/web2native/MainActivity;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const-string v0, "android.hardware.nfc"

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    new-instance p1, Lorg/json/JSONObject;

    .line 53
    .line 54
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v0, "type"

    .line 58
    .line 59
    const-string v1, "makeTapToPayStripePayment"

    .line 60
    .line 61
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    const-string v0, "failureReason"

    .line 65
    .line 66
    const-string v1, "NO_NFC_SUPPORT_ON_DEVICE"

    .line 67
    .line 68
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 69
    .line 70
    .line 71
    const-string v0, "paymentStatus"

    .line 72
    .line 73
    const-string v1, "FAILED"

    .line 74
    .line 75
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, p1}, LR4/l3;->a(Lorg/json/JSONObject;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    return-void
.end method

.method public final nfcSupported()V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v1, v1, LR4/i;->F:LR4/P2;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v1, LR4/P2;->a:Ljava/lang/Boolean;

    .line 13
    .line 14
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v1, v2

    .line 22
    :goto_0
    if-eqz v1, :cond_2

    .line 23
    .line 24
    new-instance v1, Lorg/json/JSONObject;

    .line 25
    .line 26
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v3, "type"

    .line 30
    .line 31
    const-string v4, "nfcSupported"

    .line 32
    .line 33
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 34
    .line 35
    .line 36
    iget-object v3, v0, LR4/k1;->S:Lg5/h;

    .line 37
    .line 38
    iget-object v3, v3, Lg5/h;->a:Lcom/web2native/MainActivity;

    .line 39
    .line 40
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const-string v4, "android.hardware.nfc"

    .line 45
    .line 46
    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    const-string v4, "deviceSupportNfc"

    .line 51
    .line 52
    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    iget-object v0, v0, LR4/k1;->S:Lg5/h;

    .line 56
    .line 57
    iget-object v0, v0, Lg5/h;->a:Lcom/web2native/MainActivity;

    .line 58
    .line 59
    invoke-static {v0}, Landroid/nfc/NfcAdapter;->getDefaultAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/nfc/NfcAdapter;->isEnabled()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v3, 0x1

    .line 70
    if-ne v0, v3, :cond_1

    .line 71
    .line 72
    move v2, v3

    .line 73
    :cond_1
    const-string v0, "nfcEnabledOnDevice"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v1}, LR4/l3;->a(Lorg/json/JSONObject;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void
.end method

.method public final openAppSettingForPermission(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 8
    .line 9
    iget-object v0, v0, LR4/k1;->S:Lg5/h;

    .line 10
    .line 11
    const-string v1, "openAppSettingForPermission"

    .line 12
    .line 13
    iput-object v1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lg5/h;->d(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final openShareIntent(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.intent.action.SEND"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    const-string v1, "text/plain"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    const-string v1, "android.intent.extra.TEXT"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    const-string p1, "Share"

    .line 22
    .line 23
    invoke-static {v0, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final openUrlInBrowser(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, LR4/i3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, p0, v1}, LR4/i3;-><init>(Ljava/lang/String;LR4/l3;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final openVoiceSearch()V
    .locals 9
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, LR4/U;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 7
    .line 8
    iput-object v1, v0, LR4/U;->a:Lcom/web2native/MainActivity;

    .line 9
    .line 10
    new-instance v1, Lorg/json/JSONArray;

    .line 11
    .line 12
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v2, ""

    .line 16
    .line 17
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const/4 v4, 0x1

    .line 26
    :try_start_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-lez v5, :cond_0

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-virtual {v1, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-static {v5}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception v1

    .line 46
    move-object v6, v2

    .line 47
    move v5, v4

    .line 48
    goto :goto_2

    .line 49
    :cond_0
    move v5, v4

    .line 50
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-le v6, v4, :cond_1

    .line 55
    .line 56
    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    const-string v7, "getString(...)"

    .line 61
    .line 62
    invoke-static {v6, v7}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catch_1
    move-exception v1

    .line 67
    move-object v6, v2

    .line 68
    goto :goto_2

    .line 69
    :cond_1
    move-object v6, v2

    .line 70
    :goto_1
    :try_start_2
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    const/4 v8, 0x2

    .line 75
    if-le v7, v8, :cond_2

    .line 76
    .line 77
    invoke-virtual {v1, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 81
    goto :goto_3

    .line 82
    :catch_2
    move-exception v1

    .line 83
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    const-string v4, "startSpeechRecognitionActivity exception: %s"

    .line 96
    .line 97
    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v4, "U"

    .line 102
    .line 103
    invoke-static {v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    :cond_2
    :goto_3
    new-instance v1, Landroid/content/Intent;

    .line 107
    .line 108
    const-string v4, "android.speech.action.RECOGNIZE_SPEECH"

    .line 109
    .line 110
    invoke-direct {v1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v4, "android.speech.extra.LANGUAGE_MODEL"

    .line 114
    .line 115
    const-string v7, "free_form"

    .line 116
    .line 117
    invoke-virtual {v1, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 118
    .line 119
    .line 120
    const-string v4, "android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS"

    .line 121
    .line 122
    const/16 v7, 0x3e8

    .line 123
    .line 124
    invoke-virtual {v1, v4, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 125
    .line 126
    .line 127
    const-string v4, "android.speech.extra.LANGUAGE"

    .line 128
    .line 129
    invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 130
    .line 131
    .line 132
    if-lez v5, :cond_3

    .line 133
    .line 134
    const-string v3, "android.speech.extra.MAX_RESULTS"

    .line 135
    .line 136
    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 137
    .line 138
    .line 139
    :cond_3
    invoke-virtual {v6, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-nez v2, :cond_4

    .line 144
    .line 145
    const-string v2, "android.speech.extra.PROMPT"

    .line 146
    .line 147
    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 148
    .line 149
    .line 150
    :cond_4
    iget-object v0, v0, LR4/U;->a:Lcom/web2native/MainActivity;

    .line 151
    .line 152
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    const/16 v2, 0x66

    .line 156
    .line 157
    invoke-virtual {v0, v1, v2}, Lb/l;->startActivityForResult(Landroid/content/Intent;I)V

    .line 158
    .line 159
    .line 160
    return-void
.end method

.method public final optInOneSignalPermissionDialog()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final optOutOneSignalPermissionDialog()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final pairWithDevice(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->i0:LR4/V;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final pausePlaying()V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final pickDateTime(Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->b:LR4/U;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LR4/U;

    .line 6
    .line 7
    iget-object v1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 8
    .line 9
    invoke-direct {v0, v1}, LR4/U;-><init>(Lcom/web2native/MainActivity;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LR4/l3;->b:LR4/U;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LR4/l3;->b:LR4/U;

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v0, LR4/U;->a:Lcom/web2native/MainActivity;

    .line 20
    .line 21
    new-instance v1, LJ5/i;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    invoke-direct {v1, v3, p0}, LJ5/i;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    new-instance v3, Lorg/json/JSONObject;

    .line 31
    .line 32
    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string p1, "showDate"

    .line 36
    .line 37
    invoke-virtual {v3, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    const/4 v5, 0x1

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    invoke-virtual {v3, p1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    move p1, v5

    .line 50
    :goto_0
    const-string v4, "showTime"

    .line 51
    .line 52
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_3

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    const/4 v3, 0x0

    .line 64
    :goto_1
    const/4 v4, 0x5

    .line 65
    const/4 v6, 0x2

    .line 66
    if-eqz p1, :cond_4

    .line 67
    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1, v5}, Ljava/util/Calendar;->get(I)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    invoke-virtual {p1, v6}, Ljava/util/Calendar;->get(I)I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    invoke-virtual {p1, v4}, Ljava/util/Calendar;->get(I)I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    move-object v3, v1

    .line 87
    new-instance v1, Landroid/app/DatePickerDialog;

    .line 88
    .line 89
    new-instance v4, LR4/Q;

    .line 90
    .line 91
    invoke-direct {v4, p1, v0, v3}, LR4/Q;-><init>(Ljava/util/Calendar;LR4/U;LJ5/i;)V

    .line 92
    .line 93
    .line 94
    const v3, 0x7f12012e

    .line 95
    .line 96
    .line 97
    invoke-direct/range {v1 .. v7}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;ILandroid/app/DatePickerDialog$OnDateSetListener;III)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_4
    move-object v3, v1

    .line 105
    if-eqz p1, :cond_5

    .line 106
    .line 107
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1, v5}, Ljava/util/Calendar;->get(I)I

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    invoke-virtual {p1, v6}, Ljava/util/Calendar;->get(I)I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    invoke-virtual {p1, v4}, Ljava/util/Calendar;->get(I)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    new-instance v1, Landroid/app/DatePickerDialog;

    .line 124
    .line 125
    new-instance v4, LR4/P;

    .line 126
    .line 127
    invoke-direct {v4, p1, v3}, LR4/P;-><init>(Ljava/util/Calendar;LJ5/i;)V

    .line 128
    .line 129
    .line 130
    const v3, 0x7f12012e

    .line 131
    .line 132
    .line 133
    invoke-direct/range {v1 .. v7}, Landroid/app/DatePickerDialog;-><init>(Landroid/content/Context;ILandroid/app/DatePickerDialog$OnDateSetListener;III)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_5
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    const/16 v0, 0xb

    .line 145
    .line 146
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    const/16 v0, 0xc

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    new-instance v1, Landroid/app/TimePickerDialog;

    .line 157
    .line 158
    new-instance v4, LR4/S;

    .line 159
    .line 160
    invoke-direct {v4, p1, v3}, LR4/S;-><init>(Ljava/util/Calendar;LJ5/i;)V

    .line 161
    .line 162
    .line 163
    const/4 v7, 0x0

    .line 164
    const v3, 0x7f12012e

    .line 165
    .line 166
    .line 167
    invoke-direct/range {v1 .. v7}, Landroid/app/TimePickerDialog;-><init>(Landroid/content/Context;ILandroid/app/TimePickerDialog$OnTimeSetListener;IIZ)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1}, Landroid/app/TimePickerDialog;->show()V

    .line 171
    .line 172
    .line 173
    return-void
.end method

.method public final playMedia(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final playNext()V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final playPrevious()V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final print(Ljava/lang/String;)V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->c:LR4/u0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LR4/u0;

    .line 6
    .line 7
    iget-object v1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 8
    .line 9
    invoke-direct {v0, v1}, LR4/u0;-><init>(Lcom/web2native/MainActivity;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, LR4/l3;->c:LR4/u0;

    .line 13
    .line 14
    :cond_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, LR4/l3;->c:LR4/u0;

    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    :goto_0
    if-eqz v1, :cond_1

    .line 33
    .line 34
    const-string p1, "type"

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v2, "url"

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    iget-object v2, v0, LR4/u0;->a:Lcom/web2native/MainActivity;

    .line 51
    .line 52
    new-instance v3, LE1/n;

    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    invoke-direct {v3, v0, p1, v1, v4}, LE1/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method

.method public final registerForSMS()V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final registerNotification()V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v1, v0, LR4/k1;->S:Lg5/h;

    .line 4
    .line 5
    const-string v2, "registerNotification"

    .line 6
    .line 7
    iput-object v2, v1, Lg5/h;->v:Ljava/lang/String;

    .line 8
    .line 9
    sget v2, Lcom/web2native/MainActivity;->U:I

    .line 10
    .line 11
    iget-object v2, v1, Lg5/h;->f:Ljava/util/HashMap;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    new-instance v2, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v2, v1, Lg5/h;->f:Ljava/util/HashMap;

    .line 21
    .line 22
    :cond_0
    iget-object v1, v0, LR4/k1;->S:Lg5/h;

    .line 23
    .line 24
    iget-object v1, v1, Lg5/h;->f:Ljava/util/HashMap;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const-string v2, "oneSignalPlayerId"

    .line 29
    .line 30
    const-string v3, "null"

    .line 31
    .line 32
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    :cond_1
    iget-object v1, v0, LR4/k1;->S:Lg5/h;

    .line 39
    .line 40
    iget-object v1, v1, Lg5/h;->f:Ljava/util/HashMap;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const-string v2, "firebaseToken"

    .line 45
    .line 46
    const-string v3, ""

    .line 47
    .line 48
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    :cond_2
    iget-object v0, v0, LR4/k1;->S:Lg5/h;

    .line 55
    .line 56
    const-string v1, "notification"

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    invoke-virtual {v0, v1, v2}, Lg5/h;->f(Ljava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final reload()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, LR4/j3;

    .line 9
    .line 10
    const/16 v2, 0xc

    .line 11
    .line 12
    invoke-direct {v1, p0, v2}, LR4/j3;-><init>(LR4/l3;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final removeExternalUserId()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final removeFullScreenMode()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, LR4/j3;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, p0, v1}, LR4/j3;-><init>(LR4/l3;I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final removeTriggerForKey(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final removeTriggersForKeys(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final requestNotificationPermission()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, LR4/j3;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, LR4/j3;-><init>(LR4/l3;I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final returnSMSValue(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final saveSecret(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    invoke-virtual {p0}, LR4/l3;->c()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, LR4/j3;

    .line 14
    .line 15
    const/16 v2, 0x8

    .line 16
    .line 17
    invoke-direct {v1, p0, p1, v2}, LR4/j3;-><init>(LR4/l3;Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final seekTo(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final sendBarcodeValue(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v1, "type"

    .line 7
    .line 8
    const-string v2, "BARCODE_SCAN"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "value"

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {p0, v0}, LR4/l3;->a(Lorg/json/JSONObject;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final setAppData(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "setAppData - "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "NativeDataStoreLog"

    .line 16
    .line 17
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 31
    .line 32
    iget-object p1, p1, LR4/k1;->z:LR4/V;

    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final setAppsFlyerUserId(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object p1, p1, LR4/k1;->B:LR4/V;

    .line 4
    .line 5
    return-void
.end method

.method public final setCloudData(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "setCloudData - "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "NativeDataStoreLog"

    .line 16
    .line 17
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 31
    .line 32
    iget-object p1, p1, LR4/k1;->z:LR4/V;

    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final setEmail(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final setExternalUserId(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setFirebaseAnalyticsCollection(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->C:Lk3/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lk3/c;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lk3/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "Value : "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 29
    .line 30
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const-string v1, "true"

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-static {p1, v1, v2}, LJ5/t;->B0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->setAnalyticsCollectionEnabled(Z)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method public final setFirebaseDefaultParam(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->C:Lk3/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lk3/c;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lk3/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-static {p1}, LE3/h;->G(Ljava/lang/String;)Landroid/os/Bundle;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception p1

    .line 20
    const-string v1, "EXCEPTIONS"

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    :goto_0
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->setDefaultEventParameters(Landroid/os/Bundle;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final setFirebaseUserId(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->C:Lk3/c;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lk3/c;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lk3/d;

    .line 10
    .line 11
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/google/firebase/analytics/FirebaseAnalytics;->setUserId(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final setFirebaseUserProp(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->C:Lk3/c;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, v0, Lk3/c;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lk3/d;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, v0, Lk3/d;->r:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lcom/google/firebase/analytics/FirebaseAnalytics;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/analytics/FirebaseAnalytics;->setUserProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public final setFullScreenMode()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, LR4/j3;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, LR4/j3;-><init>(LR4/l3;I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setOrientation(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "forceOrientation"

    .line 2
    .line 3
    const-string v1, "orientation"

    .line 4
    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :catch_0
    move-exception p1

    .line 25
    goto :goto_2

    .line 26
    :cond_0
    move-object p1, v3

    .line 27
    :goto_0
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    :cond_1
    if-eqz p1, :cond_4

    .line 42
    .line 43
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v0, "toLowerCase(...)"

    .line 50
    .line 51
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const-string v0, "portrait"

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    iget-object v1, p0, LR4/l3;->a:LR4/k1;

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    :try_start_1
    iget-object p1, v1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    const-string v0, "landscape"

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_3

    .line 78
    .line 79
    iget-object p1, v1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 83
    .line 84
    .line 85
    :cond_3
    :goto_1
    if-eqz v3, :cond_4

    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_4

    .line 92
    .line 93
    new-instance p1, Landroid/os/Handler;

    .line 94
    .line 95
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, LR4/j3;

    .line 103
    .line 104
    const/4 v1, 0x4

    .line 105
    invoke-direct {v0, p0, v1}, LR4/j3;-><init>(LR4/l3;I)V

    .line 106
    .line 107
    .line 108
    const-wide/16 v1, 0x3e8

    .line 109
    .line 110
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 115
    .line 116
    .line 117
    :cond_4
    return-void
.end method

.method public final setPrintSize(Ljava/lang/String;)V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "label"

    .line 2
    .line 3
    const-string v1, "printSize"

    .line 4
    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string p1, "custom"

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception p1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    const/4 v3, 0x0

    .line 28
    :goto_0
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v0, "getString(...)"

    .line 39
    .line 40
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    if-eqz v3, :cond_3

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 53
    .line 54
    iget-object v0, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    invoke-virtual {v0, v2}, Landroid/app/Activity;->getPreferences(I)Landroid/content/SharedPreferences;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    const-string v2, "printId"

    .line 66
    .line 67
    const-string v4, "customPrintSize"

    .line 68
    .line 69
    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 70
    .line 71
    .line 72
    const-string v2, "printLabel"

    .line 73
    .line 74
    invoke-interface {v0, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 75
    .line 76
    .line 77
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 78
    .line 79
    .line 80
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :goto_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 85
    .line 86
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    throw v0

    .line 90
    :cond_3
    :goto_2
    return-void
.end method

.method public final setSMSNumber(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final setText(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->f:LB0/G0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 6
    .line 7
    iget-object v1, v0, LR4/k1;->H:LR4/l3;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v1, LB0/G0;

    .line 12
    .line 13
    iget-object v2, p0, LR4/l3;->k:Lcom/web2native/MainActivity;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "getApplicationContext(...)"

    .line 20
    .line 21
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, LR4/k1;->H:LR4/l3;

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, v2, v0}, LB0/G0;-><init>(Landroid/content/Context;LR4/l3;)V

    .line 30
    .line 31
    .line 32
    iput-object v1, p0, LR4/l3;->f:LB0/G0;

    .line 33
    .line 34
    :cond_0
    iget-object v0, p0, LR4/l3;->f:LB0/G0;

    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const-string v1, ""

    .line 43
    .line 44
    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v1, "newPlainText(...)"

    .line 49
    .line 50
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v0, LB0/G0;->t:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, Landroid/content/ClipboardManager;

    .line 56
    .line 57
    invoke-virtual {v1, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 58
    .line 59
    .line 60
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    const/16 v1, 0x1f

    .line 63
    .line 64
    if-gt p1, v1, :cond_1

    .line 65
    .line 66
    iget-object p1, v0, LB0/G0;->r:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p1, Landroid/content/Context;

    .line 69
    .line 70
    const-string v0, "copied"

    .line 71
    .line 72
    const/4 v1, 0x0

    .line 73
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 78
    .line 79
    .line 80
    :cond_1
    return-void
.end method

.method public final setUser(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, LR4/i;->m:LR4/G;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, LR4/G;->a:Ljava/lang/Boolean;

    .line 12
    .line 13
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, LR4/l3;->e:Lcom/web2native/OrufyConnectHandlerUtil;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lcom/web2native/OrufyConnectHandlerUtil;->setUser(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final setUserTags(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final share(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, LR4/i3;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p1, p0, v1}, LR4/i3;-><init>(Ljava/lang/String;LR4/l3;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final shareFile(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 4
    .line 5
    new-instance v1, LE1/n;

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    invoke-direct {v1, p1, p0, p2, v2}, LE1/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final showBannerAd(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object p1, p1, LR4/k1;->E:LR4/V;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final showFloatingButton()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->t:Lj5/d;

    .line 4
    .line 5
    iget-object v0, v0, Lj5/d;->h:LP5/S;

    .line 6
    .line 7
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2, v1}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final showFullScreenAd(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object p1, p1, LR4/k1;->E:LR4/V;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final showHideStickyFooter(Z)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "Asdfasdf"

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 11
    .line 12
    iput-boolean p1, v0, LR4/k1;->y:Z

    .line 13
    .line 14
    iget-object v0, v0, LR4/k1;->w:Lb4/e;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, LR4/k3;

    .line 19
    .line 20
    invoke-direct {v0, p1, p0}, LR4/k3;-><init>(ZLR4/l3;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final showInAppReview()V
    .locals 10
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    const-string v1, "dataObjects"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LR4/l3;->o:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, p0, LR4/l3;->q:Landroid/content/SharedPreferences;

    .line 11
    .line 12
    new-instance v3, LB0/G0;

    .line 13
    .line 14
    iget-object v4, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 15
    .line 16
    iget-object v0, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 17
    .line 18
    invoke-direct {v3, v4, v0, v1, v2}, LB0/G0;-><init>(Lcom/web2native/MainActivity;Lcom/web2native/MainActivity;Ljava/lang/String;Landroid/content/SharedPreferences;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    move-object v4, v0

    .line 28
    :cond_0
    new-instance v0, LB0/o;

    .line 29
    .line 30
    new-instance v1, LD4/f;

    .line 31
    .line 32
    invoke-direct {v1, v4}, LD4/f;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v2, Landroid/os/Handler;

    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-direct {v2, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 45
    .line 46
    .line 47
    iput-object v2, v0, LB0/o;->r:Ljava/lang/Object;

    .line 48
    .line 49
    iput-object v1, v0, LB0/o;->q:Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v1, v0, LB0/o;->q:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, LD4/f;

    .line 54
    .line 55
    sget-object v2, LD4/f;->c:LE4/f;

    .line 56
    .line 57
    iget-object v4, v1, LD4/f;->b:Ljava/lang/String;

    .line 58
    .line 59
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    const-string v5, "requestInAppReview (%s)"

    .line 64
    .line 65
    invoke-virtual {v2, v5, v4}, LE4/f;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v4, v1, LD4/f;->a:LE4/k;

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    if-nez v4, :cond_3

    .line 72
    .line 73
    new-array v1, v5, [Ljava/lang/Object;

    .line 74
    .line 75
    const-string v4, "PlayCore"

    .line 76
    .line 77
    const/4 v5, 0x6

    .line 78
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_1

    .line 83
    .line 84
    iget-object v2, v2, LE4/f;->b:Ljava/lang/String;

    .line 85
    .line 86
    const-string v5, "Play Store app is either not installed or not the official version"

    .line 87
    .line 88
    invoke-static {v2, v5, v1}, LE4/f;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    .line 95
    :cond_1
    new-instance v1, LA4/a;

    .line 96
    .line 97
    new-instance v2, Lcom/google/android/gms/common/api/Status;

    .line 98
    .line 99
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    const/4 v5, -0x1

    .line 104
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    sget-object v7, LF4/a;->a:Ljava/util/HashMap;

    .line 109
    .line 110
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    if-nez v9, :cond_2

    .line 119
    .line 120
    const-string v7, ""

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_2
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    check-cast v7, Ljava/lang/String;

    .line 128
    .line 129
    sget-object v9, LF4/a;->b:Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    check-cast v8, Ljava/lang/String;

    .line 136
    .line 137
    new-instance v9, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v7, " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#"

    .line 146
    .line 147
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    const-string v7, ")"

    .line 154
    .line 155
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    :goto_0
    filled-new-array {v6, v7}, [Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    const-string v7, "Review Error(%d): %s"

    .line 167
    .line 168
    invoke-static {v4, v7, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    const/4 v6, 0x0

    .line 173
    invoke-direct {v2, v5, v4, v6, v6}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/b;)V

    .line 174
    .line 175
    .line 176
    invoke-direct {v1, v2}, Lcom/google/android/gms/common/g;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 177
    .line 178
    .line 179
    new-instance v2, LS3/k;

    .line 180
    .line 181
    invoke-direct {v2}, LS3/k;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v1}, LS3/k;->f(Ljava/lang/Exception;)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_3
    new-instance v2, LS3/e;

    .line 189
    .line 190
    invoke-direct {v2}, LS3/e;-><init>()V

    .line 191
    .line 192
    .line 193
    iget-object v4, v1, LD4/f;->a:LE4/k;

    .line 194
    .line 195
    new-instance v6, LD4/d;

    .line 196
    .line 197
    const/4 v7, 0x0

    .line 198
    invoke-direct {v6, v1, v2, v2, v7}, LD4/d;-><init>(Ljava/lang/Object;LS3/e;Ljava/lang/Object;I)V

    .line 199
    .line 200
    .line 201
    iget-object v1, v4, LE4/k;->f:Ljava/lang/Object;

    .line 202
    .line 203
    monitor-enter v1

    .line 204
    :try_start_0
    iget-object v7, v4, LE4/k;->e:Ljava/util/HashSet;

    .line 205
    .line 206
    invoke-virtual {v7, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    iget-object v7, v2, LS3/e;->a:LS3/k;

    .line 210
    .line 211
    new-instance v8, LB0/o;

    .line 212
    .line 213
    invoke-direct {v8, v4, v2}, LB0/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v7, v8}, LS3/k;->e(LS3/a;)LS3/k;

    .line 217
    .line 218
    .line 219
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 220
    iget-object v7, v4, LE4/k;->f:Ljava/lang/Object;

    .line 221
    .line 222
    monitor-enter v7

    .line 223
    :try_start_1
    iget-object v1, v4, LE4/k;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 224
    .line 225
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-lez v1, :cond_4

    .line 230
    .line 231
    iget-object v1, v4, LE4/k;->b:LE4/f;

    .line 232
    .line 233
    new-array v5, v5, [Ljava/lang/Object;

    .line 234
    .line 235
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    const-string v8, "PlayCore"

    .line 239
    .line 240
    const/4 v9, 0x3

    .line 241
    invoke-static {v8, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 242
    .line 243
    .line 244
    move-result v9

    .line 245
    if-eqz v9, :cond_4

    .line 246
    .line 247
    iget-object v1, v1, LE4/f;->b:Ljava/lang/String;

    .line 248
    .line 249
    const-string v9, "Already connected to the service."

    .line 250
    .line 251
    invoke-static {v1, v9, v5}, LE4/f;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-static {v8, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 256
    .line 257
    .line 258
    goto :goto_1

    .line 259
    :catchall_0
    move-exception v0

    .line 260
    goto :goto_3

    .line 261
    :cond_4
    :goto_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 262
    new-instance v1, LD4/d;

    .line 263
    .line 264
    const/4 v5, 0x1

    .line 265
    invoke-direct {v1, v4, v2, v6, v5}, LD4/d;-><init>(Ljava/lang/Object;LS3/e;Ljava/lang/Object;I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v4}, LE4/k;->a()Landroid/os/Handler;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-virtual {v4, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 273
    .line 274
    .line 275
    iget-object v2, v2, LS3/e;->a:LS3/k;

    .line 276
    .line 277
    :goto_2
    const-string v1, "requestReviewFlow(...)"

    .line 278
    .line 279
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    new-instance v1, LC0/Z0;

    .line 283
    .line 284
    const/16 v4, 0x10

    .line 285
    .line 286
    invoke-direct {v1, v4}, LC0/Z0;-><init>(I)V

    .line 287
    .line 288
    .line 289
    sget-object v4, LS3/f;->a:LO3/Q0;

    .line 290
    .line 291
    new-instance v5, LS3/h;

    .line 292
    .line 293
    invoke-direct {v5, v4, v1}, LS3/h;-><init>(Ljava/util/concurrent/Executor;LS3/b;)V

    .line 294
    .line 295
    .line 296
    iget-object v1, v2, LS3/k;->b:Lcom/google/android/gms/internal/measurement/O1;

    .line 297
    .line 298
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/measurement/O1;->e(LS3/i;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2}, LS3/k;->i()V

    .line 302
    .line 303
    .line 304
    new-instance v1, LU4/E;

    .line 305
    .line 306
    invoke-direct {v1, v0, v3}, LU4/E;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v1}, LS3/k;->e(LS3/a;)LS3/k;

    .line 310
    .line 311
    .line 312
    return-void

    .line 313
    :goto_3
    :try_start_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 314
    throw v0

    .line 315
    :catchall_1
    move-exception v0

    .line 316
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 317
    throw v0
.end method

.method public final showOfferCard(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v1, LR4/i;->o:LR4/L1;

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v1, LR4/i;->o:LR4/L1;

    .line 20
    .line 21
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, v1, LR4/L1;->a:Ljava/lang/Boolean;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 29
    .line 30
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, v1, LR4/i;->o:LR4/L1;

    .line 34
    .line 35
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v1, LR4/L1;->a:Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    iget-object v0, v0, LR4/k1;->J:LB0/o;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    invoke-static {p1}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    iget-object v0, v0, LB0/o;->r:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, LZ4/M;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-virtual {v0, p1}, LZ4/M;->d(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    :goto_0
    return-void
.end method

.method public final showPermission(Ljava/lang/String;)V
    .locals 7
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    new-instance v0, Lorg/json/JSONObject;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string p1, "permission"

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object p1, v2

    .line 23
    :goto_0
    iget-object v1, p0, LR4/l3;->a:LR4/k1;

    .line 24
    .line 25
    iget-object v3, v1, LR4/k1;->S:Lg5/h;

    .line 26
    .line 27
    const-string v4, "openAppSetting"

    .line 28
    .line 29
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eqz v5, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/4 v4, 0x0

    .line 41
    :goto_1
    iput-boolean v4, v3, Lg5/h;->u:Z

    .line 42
    .line 43
    iget-object v3, v1, LR4/k1;->S:Lg5/h;

    .line 44
    .line 45
    iget-boolean v4, v3, Lg5/h;->u:Z

    .line 46
    .line 47
    const/4 v5, 0x1

    .line 48
    if-ne v4, v5, :cond_2

    .line 49
    .line 50
    const-string v4, "alertDialogStyle"

    .line 51
    .line 52
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_2

    .line 57
    .line 58
    new-instance v2, Lorg/json/JSONObject;

    .line 59
    .line 60
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iput-object v2, v3, Lg5/h;->w:Lorg/json/JSONObject;

    .line 68
    .line 69
    iget-object v0, v1, LR4/k1;->S:Lg5/h;

    .line 70
    .line 71
    const-string v1, "showPermission"

    .line 72
    .line 73
    iput-object v1, v0, Lg5/h;->v:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, p1, v5}, Lg5/h;->f(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    :cond_3
    return-void
.end method

.method public final showRewardsAd(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object p1, p1, LR4/k1;->E:LR4/V;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final signInWithGoogle()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, LR4/i;->N:LR4/P0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, LR4/P0;->a:Ljava/lang/String;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    :try_start_0
    sget-object v0, LR4/V;->d:LR4/V;

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    new-instance v0, LR4/V;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, LR4/V;->d:LR4/V;

    .line 28
    .line 29
    :cond_2
    sget-object v0, LR4/V;->d:LR4/V;

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final signOutWithGoogle()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->d:LR4/i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, LR4/i;->N:LR4/P0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, LR4/P0;->a:Ljava/lang/String;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    :try_start_0
    sget-object v0, LR4/V;->d:LR4/V;

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    new-instance v0, LR4/V;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, LR4/V;->d:LR4/V;

    .line 28
    .line 29
    :cond_2
    sget-object v0, LR4/V;->d:LR4/V;

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final startBackgroundService()V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    invoke-virtual {p0}, LR4/l3;->stopBackgroundService()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final startBluetoothScan()V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->i0:LR4/V;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final startScanner(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final startTrackingLocation(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final statusBar(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "values"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final stopBackgroundService()V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final stopPlaying()V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final stopTrackingLocation()V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    return-void
.end method

.method public final subscribeToTopic(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, LR4/j3;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p0, p1, v1}, LR4/j3;-><init>(LR4/l3;Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final systemNavBarColorFun(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string p1, "colour"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const-string v0, ""

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    new-instance v0, LN5/c;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    iget-object v2, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 31
    .line 32
    invoke-direct {v0, v1, v2, p1}, LN5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_1
    return-void
.end method

.method public final unpairDevice(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->i0:LR4/V;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final unsubscribeFromTopic(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    new-instance v0, LR4/j3;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, v1}, LR4/j3;-><init>(LR4/l3;Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final updateAppIcon(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object p1, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object p1, p1, LR4/k1;->j0:LR4/V;

    .line 4
    .line 5
    return-void
.end method

.method public final updateApplication(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->a:LR4/k1;

    .line 2
    .line 3
    iget-object v0, v0, LR4/k1;->I:LB0/o;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v0, v0, LB0/o;->r:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LY4/d;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v1, "toLowerCase(...)"

    .line 23
    .line 24
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    const-string v1, "immediate"

    .line 30
    .line 31
    invoke-static {p1, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const/4 p1, 0x1

    .line 38
    :goto_1
    invoke-static {p1}, Ly4/m;->a(I)Ly4/l;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ly4/l;->a()Ly4/m;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_2

    .line 47
    :cond_1
    const/4 p1, 0x0

    .line 48
    goto :goto_1

    .line 49
    :goto_2
    iput-object p1, v0, LY4/d;->j:Ly4/m;

    .line 50
    .line 51
    :try_start_0
    iget-object p1, v0, LY4/d;->g:Ly4/e;

    .line 52
    .line 53
    invoke-virtual {p1}, Ly4/e;->b()LS3/k;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v1, LY4/b;

    .line 58
    .line 59
    const/4 v2, 0x3

    .line 60
    invoke-direct {v1, v0, v2}, LY4/b;-><init>(LY4/d;I)V

    .line 61
    .line 62
    .line 63
    new-instance v0, LR4/L0;

    .line 64
    .line 65
    const/16 v2, 0x8

    .line 66
    .line 67
    invoke-direct {v0, v2, v1}, LR4/L0;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    sget-object v1, LS3/f;->a:LO3/Q0;

    .line 74
    .line 75
    invoke-virtual {p1, v1, v0}, LS3/k;->a(Ljava/util/concurrent/Executor;LS3/c;)LS3/k;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :catch_0
    move-exception p1

    .line 80
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 81
    .line 82
    .line 83
    :cond_2
    return-void
.end method

.method public final webShareWrapper(Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    iget-object v0, p0, LR4/l3;->l:Lcom/web2native/MainActivity;

    .line 2
    .line 3
    invoke-static {v0, p1}, LQ2/g;->M(Lcom/web2native/MainActivity;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
