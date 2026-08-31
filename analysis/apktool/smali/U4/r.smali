.class public final LU4/r;
.super Landroid/webkit/WebChromeClient;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:LR4/k1;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LP/W;LR4/k1;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LU4/r;->a:I

    iput-object p1, p0, LU4/r;->c:Ljava/lang/Object;

    iput-object p2, p0, LU4/r;->b:LR4/k1;

    .line 2
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    return-void
.end method

.method public constructor <init>(LR4/k1;Lk5/b;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LU4/r;->a:I

    const-string v0, "dataObject"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Landroid/webkit/WebChromeClient;-><init>()V

    iput-object p1, p0, LU4/r;->b:LR4/k1;

    iput-object p2, p0, LU4/r;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getDefaultVideoPoster()Landroid/graphics/Bitmap;
    .locals 3

    .line 1
    iget v0, p0, LU4/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/webkit/WebChromeClient;->getDefaultVideoPoster()Landroid/graphics/Bitmap;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget-object v0, p0, LU4/r;->b:LR4/k1;

    .line 12
    .line 13
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v1, v1, LR4/i;->u:Ljava/lang/Boolean;

    .line 18
    .line 19
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    if-nez v1, :cond_4

    .line 28
    .line 29
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v1, v1, LR4/i;->u:Ljava/lang/Boolean;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object v1, v2

    .line 38
    :goto_1
    if-nez v1, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    iget-object v0, v0, LR4/k1;->m:LE1/u;

    .line 42
    .line 43
    iget-object v1, v0, LE1/u;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Landroid/view/View;

    .line 46
    .line 47
    if-nez v1, :cond_3

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    iget-object v0, v0, LE1/u;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, LR4/k1;

    .line 53
    .line 54
    iget-object v0, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const v1, 0x7f020045

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    goto :goto_3

    .line 72
    :cond_4
    :goto_2
    iget-object v0, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 73
    .line 74
    invoke-virtual {v0}, Lh/h;->getResources()Landroid/content/res/Resources;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const v1, 0x7f070110

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    :goto_3
    return-object v2

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCloseWindow(Landroid/webkit/WebView;)V
    .locals 1

    .line 1
    iget v0, p0, LU4/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/webkit/WebView;->destroy()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void

    .line 12
    :pswitch_0
    const-string v0, "window"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onCloseWindow(Landroid/webkit/WebView;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, LU4/r;->b:LR4/k1;

    .line 21
    .line 22
    iget-object p1, p1, LR4/k1;->e:LT1/u;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, LT1/u;->c()V

    .line 27
    .line 28
    .line 29
    :cond_1
    const-string p1, "close"

    .line 30
    .line 31
    const-string v0, "Close the current window"

    .line 32
    .line 33
    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z
    .locals 4

    .line 1
    iget v0, p0, LU4/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-string v1, "Scripts may close only the windows that were opened by them"

    .line 15
    .line 16
    invoke-static {v0, v1}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x1

    .line 21
    if-ne v0, v1, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, LU4/r;->b:LR4/k1;

    .line 24
    .line 25
    iget-object v2, v0, LR4/k1;->e:LT1/u;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object v2, v2, LT1/u;->b:LW1/j;

    .line 30
    .line 31
    invoke-virtual {v2}, LW1/j;->f()LT1/p;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    iget-object v2, v2, LT1/p;->r:LW1/l;

    .line 38
    .line 39
    iget-object v2, v2, LW1/l;->e:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Ljava/lang/String;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v2, 0x0

    .line 45
    :goto_0
    const-string v3, "googleGsiLoginScreen"

    .line 46
    .line 47
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    iget-object v2, v0, LR4/k1;->A:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    const-string v3, "__/auth/handler"

    .line 58
    .line 59
    invoke-static {v2, v3}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-ne v2, v1, :cond_1

    .line 64
    .line 65
    iget-object v0, v0, LR4/k1;->e:LT1/u;

    .line 66
    .line 67
    if-eqz v0, :cond_1

    .line 68
    .line 69
    const-string v1, "mainScreen"

    .line 70
    .line 71
    invoke-static {v0, v1}, LT1/u;->b(LT1/u;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    return p1

    .line 79
    :pswitch_0
    const-string v0, "consoleMessage"

    .line 80
    .line 81
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v1, "message(...)"

    .line 89
    .line 90
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string v1, "Scripts may close only"

    .line 94
    .line 95
    invoke-static {v0, v1}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    iget-object v0, p0, LU4/r;->b:LR4/k1;

    .line 102
    .line 103
    iget-object v1, v0, LR4/k1;->e:LT1/u;

    .line 104
    .line 105
    if-eqz v1, :cond_2

    .line 106
    .line 107
    invoke-virtual {v1}, LT1/u;->a()LT1/d;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    if-eqz v1, :cond_2

    .line 112
    .line 113
    iget-object v1, v1, LT1/d;->r:LT1/p;

    .line 114
    .line 115
    if-eqz v1, :cond_2

    .line 116
    .line 117
    iget-object v1, v1, LT1/p;->r:LW1/l;

    .line 118
    .line 119
    iget-object v1, v1, LW1/l;->e:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v1, Ljava/lang/String;

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_2
    const/4 v1, 0x0

    .line 125
    :goto_1
    const-string v2, "splashScreen"

    .line 126
    .line 127
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-nez v1, :cond_3

    .line 132
    .line 133
    iget-object v0, v0, LR4/k1;->e:LT1/u;

    .line 134
    .line 135
    if-eqz v0, :cond_3

    .line 136
    .line 137
    invoke-virtual {v0}, LT1/u;->c()V

    .line 138
    .line 139
    .line 140
    :cond_3
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onConsoleMessage(Landroid/webkit/ConsoleMessage;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    return p1

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
    .locals 3

    .line 1
    iget v0, p0, LU4/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    if-eqz p4, :cond_0

    .line 8
    .line 9
    new-instance p2, Landroid/webkit/WebView;

    .line 10
    .line 11
    iget-object p3, p0, LU4/r;->b:LR4/k1;

    .line 12
    .line 13
    iget-object v0, p3, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 14
    .line 15
    invoke-direct {p2, v0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 19
    .line 20
    const-string v1, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    check-cast v0, Landroid/webkit/WebView$WebViewTransport;

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Landroid/webkit/WebView$WebViewTransport;->setWebView(Landroid/webkit/WebView;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p4}, Landroid/os/Message;->sendToTarget()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 34
    .line 35
    .line 36
    move-result-object p4

    .line 37
    const-string v0, "getSettings(...)"

    .line 38
    .line 39
    invoke-static {p4, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p4, p1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-virtual {p4, v0}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p4, p1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p4, p1}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p4, p1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p4, p1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p4, v0}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 62
    .line 63
    .line 64
    sget-object v1, Landroid/webkit/WebSettings$PluginState;->ON:Landroid/webkit/WebSettings$PluginState;

    .line 65
    .line 66
    invoke-virtual {p4, v1}, Landroid/webkit/WebSettings;->setPluginState(Landroid/webkit/WebSettings$PluginState;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p4, v0}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p4, p1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p4, p1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 79
    .line 80
    .line 81
    move-result-object p4

    .line 82
    invoke-virtual {p4, p1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 86
    .line 87
    .line 88
    move-result-object p4

    .line 89
    invoke-virtual {p4, p1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 93
    .line 94
    .line 95
    new-instance p4, LR4/t0;

    .line 96
    .line 97
    const/4 v0, 0x1

    .line 98
    invoke-direct {p4, v0, p3}, LR4/t0;-><init>(ILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, p4}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 102
    .line 103
    .line 104
    new-instance p3, Lk5/a;

    .line 105
    .line 106
    invoke-direct {p3}, Landroid/webkit/WebChromeClient;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, p3}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 110
    .line 111
    .line 112
    :cond_0
    return p1

    .line 113
    :pswitch_0
    const/4 v0, 0x0

    .line 114
    if-eqz p4, :cond_1

    .line 115
    .line 116
    iget-object v1, p4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    move-object v1, v0

    .line 120
    :goto_0
    instance-of v2, v1, Landroid/webkit/WebView$WebViewTransport;

    .line 121
    .line 122
    if-eqz v2, :cond_2

    .line 123
    .line 124
    move-object v0, v1

    .line 125
    check-cast v0, Landroid/webkit/WebView$WebViewTransport;

    .line 126
    .line 127
    :cond_2
    if-eqz v0, :cond_3

    .line 128
    .line 129
    iget-object v1, p0, LU4/r;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, LP/W;

    .line 132
    .line 133
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    check-cast v1, Landroid/webkit/WebView;

    .line 138
    .line 139
    invoke-virtual {v0, v1}, Landroid/webkit/WebView$WebViewTransport;->setWebView(Landroid/webkit/WebView;)V

    .line 140
    .line 141
    .line 142
    :cond_3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    return p1

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V
    .locals 8

    .line 1
    iget v0, p0, LU4/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onGeolocationPermissionsShowPrompt(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, LU4/r;->b:LR4/k1;

    .line 11
    .line 12
    iget-object v1, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 13
    .line 14
    invoke-static {v1}, Ll6/d;->u(Landroid/content/Context;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object v1, v0, LR4/k1;->S:Lg5/h;

    .line 22
    .line 23
    const-string v3, "location"

    .line 24
    .line 25
    invoke-virtual {v1, v3}, Lg5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v3, "ALLOWED"

    .line 30
    .line 31
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    if-eqz p2, :cond_5

    .line 38
    .line 39
    invoke-interface {p2, p1, v2, v2}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v0}, LR4/k1;->a()LO3/Y;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v3, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 48
    .line 49
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 50
    .line 51
    .line 52
    move-result-wide v4

    .line 53
    iget-wide v6, v1, LO3/Y;->b:J

    .line 54
    .line 55
    sub-long/2addr v4, v6

    .line 56
    const-wide/16 v6, 0x3e8

    .line 57
    .line 58
    cmp-long v4, v4, v6

    .line 59
    .line 60
    if-gez v4, :cond_1

    .line 61
    .line 62
    invoke-static {p2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {p2, p1, v2, v2}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iget-object v4, v1, LO3/Y;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, LR4/V;

    .line 72
    .line 73
    invoke-static {v4}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v3}, LR4/V;->h(Landroid/content/Context;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-eqz v4, :cond_3

    .line 81
    .line 82
    invoke-static {v3}, Ll6/d;->u(Landroid/content/Context;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    invoke-static {p2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    const/4 v0, 0x1

    .line 92
    invoke-interface {p2, p1, v0, v2}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_2
    iput-object p2, v1, LO3/Y;->d:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object p1, v1, LO3/Y;->c:Ljava/lang/Object;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_3
    iget-object v2, v1, LO3/Y;->e:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, LR4/V;

    .line 104
    .line 105
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    invoke-static {v3}, LR4/V;->h(Landroid/content/Context;)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_4

    .line 113
    .line 114
    invoke-static {v3}, Ll6/d;->u(Landroid/content/Context;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_5

    .line 119
    .line 120
    :cond_4
    iput-object p1, v1, LO3/Y;->c:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object p2, v1, LO3/Y;->d:Ljava/lang/Object;

    .line 123
    .line 124
    iget-object p1, v0, LR4/k1;->S:Lg5/h;

    .line 125
    .line 126
    invoke-virtual {p1}, Lg5/h;->e()V

    .line 127
    .line 128
    .line 129
    :cond_5
    :goto_0
    return-void

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onHideCustomView()V
    .locals 4

    .line 1
    iget v0, p0, LU4/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/webkit/WebChromeClient;->onHideCustomView()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, LU4/r;->b:LR4/k1;

    .line 11
    .line 12
    iget-object v1, v0, LR4/k1;->m:LE1/u;

    .line 13
    .line 14
    invoke-virtual {v1}, LE1/u;->a()V

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    new-instance v1, LC0/m;

    .line 22
    .line 23
    const/16 v2, 0x13

    .line 24
    .line 25
    invoke-direct {v1, v2, p0}, LC0/m;-><init>(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    const-wide/16 v2, 0x12c

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 2

    .line 1
    iget v0, p0, LU4/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsAlert(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    const-string p1, "message"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "result"

    .line 17
    .line 18
    invoke-static {p4, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, LU4/r;->b:LR4/k1;

    .line 22
    .line 23
    iget-object p2, p1, LR4/k1;->e:LT1/u;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    iget-object p2, p2, LT1/u;->b:LW1/j;

    .line 29
    .line 30
    invoke-virtual {p2}, LW1/j;->f()LT1/p;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    iget-object p2, p2, LT1/p;->r:LW1/l;

    .line 37
    .line 38
    iget-object p2, p2, LW1/l;->e:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p2, Ljava/lang/String;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object p2, v0

    .line 44
    :goto_0
    const-string v1, "splashScreen"

    .line 45
    .line 46
    invoke-static {p2, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-nez p2, :cond_2

    .line 51
    .line 52
    iget-object p2, p1, LR4/k1;->e:LT1/u;

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    iget-object p2, p2, LT1/u;->b:LW1/j;

    .line 57
    .line 58
    invoke-virtual {p2}, LW1/j;->f()LT1/p;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    if-eqz p2, :cond_1

    .line 63
    .line 64
    iget-object p2, p2, LT1/p;->r:LW1/l;

    .line 65
    .line 66
    iget-object p2, p2, LW1/l;->e:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v0, p2

    .line 69
    check-cast v0, Ljava/lang/String;

    .line 70
    .line 71
    :cond_1
    const-string p2, "onboardingScreen"

    .line 72
    .line 73
    invoke-static {v0, p2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-nez p2, :cond_2

    .line 78
    .line 79
    iget-object p1, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 80
    .line 81
    invoke-static {p1}, LQ2/g;->A(Lcom/web2native/MainActivity;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 86
    .line 87
    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1, p3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    new-instance p2, LR4/K;

    .line 99
    .line 100
    const/4 p3, 0x0

    .line 101
    invoke-direct {p2, p3}, LR4/K;-><init>(I)V

    .line 102
    .line 103
    .line 104
    const-string p3, "Ok"

    .line 105
    .line 106
    invoke-virtual {p1, p3, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p4}, Landroid/webkit/JsResult;->confirm()V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    invoke-virtual {p4}, Landroid/webkit/JsResult;->cancel()V

    .line 121
    .line 122
    .line 123
    :goto_1
    const/4 p1, 0x1

    .line 124
    return p1

    .line 125
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z
    .locals 4

    .line 1
    iget v0, p0, LU4/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    iget-object v0, p0, LU4/r;->b:LR4/k1;

    .line 12
    .line 13
    iget-object v1, v0, LR4/k1;->e:LT1/u;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object v1, v1, LT1/u;->b:LW1/j;

    .line 19
    .line 20
    invoke-virtual {v1}, LW1/j;->f()LT1/p;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v1, v1, LT1/p;->r:LW1/l;

    .line 27
    .line 28
    iget-object v1, v1, LW1/l;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Ljava/lang/String;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v1, v2

    .line 34
    :goto_0
    const-string v3, "splashScreen"

    .line 35
    .line 36
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    iget-object v0, v0, LR4/k1;->e:LT1/u;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v0, v0, LT1/u;->b:LW1/j;

    .line 47
    .line 48
    invoke-virtual {v0}, LW1/j;->f()LT1/p;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    iget-object v0, v0, LT1/p;->r:LW1/l;

    .line 55
    .line 56
    iget-object v0, v0, LW1/l;->e:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v2, v0

    .line 59
    check-cast v2, Ljava/lang/String;

    .line 60
    .line 61
    :cond_1
    const-string v0, "onboardingScreen"

    .line 62
    .line 63
    invoke-static {v2, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebChromeClient;->onJsConfirm(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    goto :goto_1

    .line 74
    :cond_2
    if-eqz p4, :cond_3

    .line 75
    .line 76
    invoke-virtual {p4}, Landroid/webkit/JsResult;->cancel()V

    .line 77
    .line 78
    .line 79
    :cond_3
    const/4 p1, 0x1

    .line 80
    :goto_1
    return p1

    .line 81
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onPermissionRequest(Landroid/webkit/PermissionRequest;)V
    .locals 14

    .line 1
    iget v0, p0, LU4/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/webkit/WebChromeClient;->onPermissionRequest(Landroid/webkit/PermissionRequest;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    if-eqz p1, :cond_9

    .line 11
    .line 12
    iget-object v0, p0, LU4/r;->b:LR4/k1;

    .line 13
    .line 14
    iget-object v1, v0, LR4/k1;->S:Lg5/h;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget v2, v0, LR4/k1;->c0:I

    .line 20
    .line 21
    iget v3, v0, LR4/k1;->e0:I

    .line 22
    .line 23
    iget-object v4, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 24
    .line 25
    iget-object v5, v0, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    const-string v7, "getResources(...)"

    .line 32
    .line 33
    invoke-static {v6, v7}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    array-length v7, v6

    .line 37
    const/4 v8, 0x0

    .line 38
    move v9, v8

    .line 39
    move v10, v9

    .line 40
    :goto_0
    if-ge v8, v7, :cond_2

    .line 41
    .line 42
    aget-object v11, v6, v8

    .line 43
    .line 44
    const-string v12, "android.webkit.resource.AUDIO_CAPTURE"

    .line 45
    .line 46
    invoke-static {v11, v12}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v12

    .line 50
    const/4 v13, 0x1

    .line 51
    if-eqz v12, :cond_0

    .line 52
    .line 53
    move v9, v13

    .line 54
    :cond_0
    const-string v12, "android.webkit.resource.VIDEO_CAPTURE"

    .line 55
    .line 56
    invoke-static {v11, v12}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    if-eqz v11, :cond_1

    .line 61
    .line 62
    move v10, v13

    .line 63
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const-string v6, "android.permission.CAMERA"

    .line 67
    .line 68
    const-string v7, "android.permission.RECORD_AUDIO"

    .line 69
    .line 70
    if-eqz v9, :cond_6

    .line 71
    .line 72
    if-eqz v10, :cond_6

    .line 73
    .line 74
    invoke-static {v5, v7}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-eqz v8, :cond_3

    .line 79
    .line 80
    invoke-static {v5, v6}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-eqz v8, :cond_3

    .line 85
    .line 86
    iput-object p1, v1, Lg5/h;->r:Landroid/webkit/PermissionRequest;

    .line 87
    .line 88
    filled-new-array {v7, v6}, [Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget v0, v0, LR4/k1;->h0:I

    .line 93
    .line 94
    invoke-virtual {v4, p1, v0}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    invoke-static {v5, v7}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-eqz v0, :cond_4

    .line 103
    .line 104
    invoke-static {v5, v6}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_4

    .line 109
    .line 110
    iput-object p1, v1, Lg5/h;->r:Landroid/webkit/PermissionRequest;

    .line 111
    .line 112
    filled-new-array {v7}, [Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {v4, p1, v3}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    invoke-static {v5, v6}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    invoke-static {v5, v7}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-nez v0, :cond_5

    .line 131
    .line 132
    iput-object p1, v1, Lg5/h;->r:Landroid/webkit/PermissionRequest;

    .line 133
    .line 134
    filled-new-array {v6}, [Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {v4, p1, v2}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {p1, v0}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_6
    if-eqz v9, :cond_7

    .line 151
    .line 152
    invoke-static {v5, v7}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-eqz v0, :cond_7

    .line 157
    .line 158
    iput-object p1, v1, Lg5/h;->r:Landroid/webkit/PermissionRequest;

    .line 159
    .line 160
    filled-new-array {v7}, [Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {v4, p1, v3}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_7
    if-eqz v10, :cond_8

    .line 169
    .line 170
    invoke-static {v5, v6}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_8

    .line 175
    .line 176
    iput-object p1, v1, Lg5/h;->r:Landroid/webkit/PermissionRequest;

    .line 177
    .line 178
    filled-new-array {v6}, [Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {v4, p1, v2}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_8
    invoke-virtual {p1}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {p1, v0}, Landroid/webkit/PermissionRequest;->grant([Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    :cond_9
    :goto_1
    return-void

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onProgressChanged(Landroid/webkit/WebView;I)V
    .locals 4

    .line 1
    iget v0, p0, LU4/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onProgressChanged(Landroid/webkit/WebView;I)V

    .line 11
    .line 12
    .line 13
    const/16 v0, 0x46

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    iget-object v2, p0, LU4/r;->b:LR4/k1;

    .line 17
    .line 18
    if-lt p2, v0, :cond_2

    .line 19
    .line 20
    iget-boolean v0, v2, LR4/k1;->y:Z

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iput-object v1, v2, LR4/k1;->x:Ljava/lang/String;

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    iget-object v0, v2, LR4/k1;->x:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v3, v1

    .line 37
    :goto_0
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    iput-object v1, v2, LR4/k1;->x:Ljava/lang/String;

    .line 48
    .line 49
    :cond_2
    :goto_1
    const/16 v0, 0x64

    .line 50
    .line 51
    if-ne p2, v0, :cond_6

    .line 52
    .line 53
    iget-object v0, v2, LR4/k1;->d:LR4/i;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    iget-object v3, v0, LR4/i;->r:Ljava/lang/Boolean;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    move-object v3, v1

    .line 61
    :goto_2
    if-eqz v3, :cond_5

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    iget-object v0, v0, LR4/i;->r:Ljava/lang/Boolean;

    .line 66
    .line 67
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    goto :goto_3

    .line 74
    :cond_4
    const/4 v0, 0x0

    .line 75
    :goto_3
    if-eqz v0, :cond_5

    .line 76
    .line 77
    :try_start_0
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    .line 84
    goto :goto_6

    .line 85
    :catch_0
    move-exception v0

    .line 86
    goto :goto_4

    .line 87
    :catch_1
    move-exception v0

    .line 88
    goto :goto_5

    .line 89
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 90
    .line 91
    .line 92
    goto :goto_6

    .line 93
    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 94
    .line 95
    .line 96
    :cond_5
    :goto_6
    iget-object v0, v2, LR4/k1;->t:Lj5/d;

    .line 97
    .line 98
    iget-object v0, v0, Lj5/d;->f:LP5/S;

    .line 99
    .line 100
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1, v3}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :cond_6
    if-eqz p1, :cond_7

    .line 109
    .line 110
    invoke-static {p1, v2}, Lcom/google/android/gms/internal/measurement/K1;->v(Landroid/webkit/WebView;LR4/k1;)V

    .line 111
    .line 112
    .line 113
    :cond_7
    iget-object p1, v2, LR4/k1;->M:LO3/e0;

    .line 114
    .line 115
    invoke-virtual {p1}, LO3/e0;->b()Z

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, LU4/r;->c:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, Lk5/b;

    .line 121
    .line 122
    iget-object p1, p1, Lk5/b;->b:Landroidx/lifecycle/J;

    .line 123
    .line 124
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-virtual {p1, p2}, Landroidx/lifecycle/G;->k(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V
    .locals 5

    .line 1
    iget v0, p0, LU4/r;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/webkit/WebChromeClient;->onShowCustomView(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const/4 v0, 0x0

    .line 11
    iget-object v1, p0, LU4/r;->b:LR4/k1;

    .line 12
    .line 13
    iput-boolean v0, v1, LR4/k1;->a0:Z

    .line 14
    .line 15
    iget-object v0, v1, LR4/k1;->m:LE1/u;

    .line 16
    .line 17
    iget-object v1, v0, LE1/u;->d:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, LR4/k1;

    .line 20
    .line 21
    iget-object v2, v1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iput v3, v0, LE1/u;->c:I

    .line 28
    .line 29
    iget-object v3, v0, LE1/u;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Landroid/view/View;

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0}, LE1/u;->a()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    iput-object p1, v0, LE1/u;->e:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    iput p1, v0, LE1/u;->b:I

    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/app/Activity;->getRequestedOrientation()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    iput p1, v0, LE1/u;->a:I

    .line 60
    .line 61
    iput-object p2, v0, LE1/u;->f:Ljava/lang/Object;

    .line 62
    .line 63
    iget-object p1, v0, LE1/u;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Landroid/view/View;

    .line 66
    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    new-instance p2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 70
    .line 71
    const/4 v3, -0x1

    .line 72
    invoke-direct {p2, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    iget-object p1, v1, LR4/k1;->n:Lj5/a;

    .line 79
    .line 80
    iget-object p2, v0, LE1/u;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p2, Landroid/view/View;

    .line 83
    .line 84
    iget-object v0, p1, Lj5/a;->b:LP5/S;

    .line 85
    .line 86
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    const/4 v4, 0x0

    .line 92
    invoke-virtual {v0, v4, v3}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    iget-object p1, p1, Lj5/a;->d:LP5/S;

    .line 96
    .line 97
    invoke-virtual {p1, p2}, LP5/S;->g(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    const-string p2, "getDecorView(...)"

    .line 109
    .line 110
    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const/16 p2, -0x501

    .line 114
    .line 115
    invoke-virtual {p1, p2}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 116
    .line 117
    .line 118
    iget-object p1, v1, LR4/k1;->t:Lj5/d;

    .line 119
    .line 120
    iget-object p1, p1, Lj5/d;->b:LP5/S;

    .line 121
    .line 122
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v4, p2}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    const/4 p1, 0x4

    .line 131
    invoke-virtual {v2, p1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 132
    .line 133
    .line 134
    :goto_0
    return-void

    .line 135
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LU4/r;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super/range {p0 .. p3}, Landroid/webkit/WebChromeClient;->onShowFileChooser(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    return v1

    .line 13
    :pswitch_0
    const-string v1, "fileChooserParams"

    .line 14
    .line 15
    move-object/from16 v2, p3

    .line 16
    .line 17
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, LU4/r;->b:LR4/k1;

    .line 21
    .line 22
    iget-object v3, v1, LR4/k1;->S:Lg5/h;

    .line 23
    .line 24
    move-object/from16 v4, p2

    .line 25
    .line 26
    iput-object v4, v3, Lg5/h;->q:Landroid/webkit/ValueCallback;

    .line 27
    .line 28
    iget-object v3, v1, LR4/k1;->U:Lp3/z0;

    .line 29
    .line 30
    iget-object v4, v3, Lp3/z0;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, Le/g;

    .line 33
    .line 34
    iget-object v5, v3, Lp3/z0;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, Lcom/web2native/MainActivity;

    .line 37
    .line 38
    iget-object v6, v3, Lp3/z0;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v6, Le/g;

    .line 41
    .line 42
    iget-object v7, v3, Lp3/z0;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v7, Le/g;

    .line 45
    .line 46
    iget-object v8, v3, Lp3/z0;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v8, Le/g;

    .line 49
    .line 50
    iget-object v3, v3, Lp3/z0;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, LR4/k1;

    .line 53
    .line 54
    invoke-virtual {v2}, Landroid/webkit/WebChromeClient$FileChooserParams;->isCaptureEnabled()Z

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    invoke-virtual {v2}, Landroid/webkit/WebChromeClient$FileChooserParams;->getAcceptTypes()[Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v10

    .line 62
    invoke-static {v10}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    new-instance v11, Ljava/util/HashSet;

    .line 66
    .line 67
    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 68
    .line 69
    .line 70
    array-length v12, v10

    .line 71
    const/4 v14, 0x0

    .line 72
    :goto_0
    if-ge v14, v12, :cond_7

    .line 73
    .line 74
    const/16 p1, 0x1

    .line 75
    .line 76
    aget-object v15, v10, v14

    .line 77
    .line 78
    const-string v16, "[,;\\s]"

    .line 79
    .line 80
    invoke-static/range {v16 .. v16}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 81
    .line 82
    .line 83
    move-result-object v13

    .line 84
    const-string v0, "compile(...)"

    .line 85
    .line 86
    invoke-static {v13, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const-string v0, "input"

    .line 90
    .line 91
    invoke-static {v15, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v13, v15}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    .line 99
    .line 100
    .line 101
    move-result v13

    .line 102
    if-nez v13, :cond_0

    .line 103
    .line 104
    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/n2;->z(Ljava/lang/Object;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    goto :goto_2

    .line 113
    :cond_0
    new-instance v13, Ljava/util/ArrayList;

    .line 114
    .line 115
    move-object/from16 v16, v0

    .line 116
    .line 117
    const/16 v0, 0xa

    .line 118
    .line 119
    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    .line 121
    .line 122
    const/4 v0, 0x0

    .line 123
    :goto_1
    invoke-virtual/range {v16 .. v16}, Ljava/util/regex/Matcher;->start()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    invoke-virtual {v15, v0, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    invoke-virtual/range {v16 .. v16}, Ljava/util/regex/Matcher;->end()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-virtual/range {v16 .. v16}, Ljava/util/regex/Matcher;->find()Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-nez v2, :cond_6

    .line 147
    .line 148
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    invoke-virtual {v15, v0, v2}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-object v0, v13

    .line 164
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-nez v2, :cond_2

    .line 169
    .line 170
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    :goto_3
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 179
    .line 180
    .line 181
    move-result v13

    .line 182
    if-eqz v13, :cond_2

    .line 183
    .line 184
    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v13

    .line 188
    check-cast v13, Ljava/lang/String;

    .line 189
    .line 190
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 191
    .line 192
    .line 193
    move-result v13

    .line 194
    if-nez v13, :cond_1

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_1
    check-cast v0, Ljava/lang/Iterable;

    .line 198
    .line 199
    invoke-interface {v2}, Ljava/util/ListIterator;->nextIndex()I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    add-int/lit8 v2, v2, 0x1

    .line 204
    .line 205
    invoke-static {v0, v2}, Ln5/l;->y0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    goto :goto_4

    .line 210
    :cond_2
    sget-object v0, Ln5/s;->q:Ln5/s;

    .line 211
    .line 212
    :goto_4
    check-cast v0, Ljava/util/Collection;

    .line 213
    .line 214
    const/4 v2, 0x0

    .line 215
    new-array v13, v2, [Ljava/lang/String;

    .line 216
    .line 217
    invoke-interface {v0, v13}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    check-cast v0, [Ljava/lang/String;

    .line 222
    .line 223
    array-length v13, v0

    .line 224
    move v15, v2

    .line 225
    :goto_5
    if-ge v15, v13, :cond_5

    .line 226
    .line 227
    move-object/from16 v16, v0

    .line 228
    .line 229
    aget-object v0, v16, v15

    .line 230
    .line 231
    move/from16 v17, v9

    .line 232
    .line 233
    const-string v9, "."

    .line 234
    .line 235
    invoke-static {v0, v9, v2}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 236
    .line 237
    .line 238
    move-result v9

    .line 239
    if-eqz v9, :cond_3

    .line 240
    .line 241
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    move/from16 v9, p1

    .line 246
    .line 247
    invoke-virtual {v0, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    const-string v9, "substring(...)"

    .line 252
    .line 253
    invoke-static {v0, v9}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    if-eqz v0, :cond_4

    .line 261
    .line 262
    invoke-virtual {v11, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_3
    const-string v2, "/"

    .line 267
    .line 268
    invoke-static {v0, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-eqz v2, :cond_4

    .line 273
    .line 274
    invoke-virtual {v11, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    :cond_4
    :goto_6
    add-int/lit8 v15, v15, 0x1

    .line 278
    .line 279
    move-object/from16 v0, v16

    .line 280
    .line 281
    move/from16 v9, v17

    .line 282
    .line 283
    const/16 p1, 0x1

    .line 284
    .line 285
    const/4 v2, 0x0

    .line 286
    goto :goto_5

    .line 287
    :cond_5
    move/from16 v17, v9

    .line 288
    .line 289
    add-int/lit8 v14, v14, 0x1

    .line 290
    .line 291
    move-object/from16 v0, p0

    .line 292
    .line 293
    move-object/from16 v2, p3

    .line 294
    .line 295
    goto/16 :goto_0

    .line 296
    .line 297
    :cond_6
    const/16 p1, 0x1

    .line 298
    .line 299
    goto/16 :goto_1

    .line 300
    .line 301
    :cond_7
    move/from16 v17, v9

    .line 302
    .line 303
    invoke-virtual {v11}, Ljava/util/HashSet;->isEmpty()Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    const-string v2, "*/*"

    .line 308
    .line 309
    if-eqz v0, :cond_8

    .line 310
    .line 311
    invoke-virtual {v11, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 315
    .line 316
    const-string v9, "the types = "

    .line 317
    .line 318
    invoke-direct {v0, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    sget-object v9, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 329
    .line 330
    invoke-virtual {v9, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v11}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    const-string v9, "open_single_video_file"

    .line 338
    .line 339
    const-string v11, "open_multiple_video_file"

    .line 340
    .line 341
    const-string v12, " capture_video"

    .line 342
    .line 343
    const-string v13, "open_single_file"

    .line 344
    .line 345
    const-string v14, "open_multiple_file"

    .line 346
    .line 347
    const-string v15, "audio_recorder"

    .line 348
    .line 349
    move-object/from16 v16, v0

    .line 350
    .line 351
    const-string v0, "capture_choose_video"

    .line 352
    .line 353
    move-object/from16 v18, v0

    .line 354
    .line 355
    const-string v0, "open_single_image_file"

    .line 356
    .line 357
    move-object/from16 v19, v6

    .line 358
    .line 359
    const-string v6, "open_multiple_image_file"

    .line 360
    .line 361
    move-object/from16 v20, v7

    .line 362
    .line 363
    const-string v7, "capture_image"

    .line 364
    .line 365
    move-object/from16 v21, v7

    .line 366
    .line 367
    const-string v7, "capture_choose_image"

    .line 368
    .line 369
    move-object/from16 v22, v7

    .line 370
    .line 371
    const-string v7, "single_file_without_capture_option"

    .line 372
    .line 373
    move-object/from16 v23, v7

    .line 374
    .line 375
    const-string v7, "video/*"

    .line 376
    .line 377
    move-object/from16 v24, v5

    .line 378
    .line 379
    const-string v5, "image/*"

    .line 380
    .line 381
    move-object/from16 v25, v1

    .line 382
    .line 383
    const-string v1, "multiple_files_without_capture_option"

    .line 384
    .line 385
    move-object/from16 v26, v12

    .line 386
    .line 387
    const-string v12, "video"

    .line 388
    .line 389
    move-object/from16 v27, v14

    .line 390
    .line 391
    const-string v14, "image"

    .line 392
    .line 393
    if-nez v17, :cond_a

    .line 394
    .line 395
    array-length v10, v10

    .line 396
    move-object/from16 v28, v2

    .line 397
    .line 398
    const/4 v2, 0x1

    .line 399
    if-le v10, v2, :cond_b

    .line 400
    .line 401
    invoke-virtual/range {p3 .. p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    .line 402
    .line 403
    .line 404
    move-result v10

    .line 405
    move-object/from16 v30, v1

    .line 406
    .line 407
    move-object/from16 v29, v4

    .line 408
    .line 409
    move-object/from16 v31, v11

    .line 410
    .line 411
    if-ne v10, v2, :cond_9

    .line 412
    .line 413
    goto/16 :goto_b

    .line 414
    .line 415
    :cond_9
    move-object/from16 v1, v23

    .line 416
    .line 417
    goto/16 :goto_b

    .line 418
    .line 419
    :cond_a
    move-object/from16 v28, v2

    .line 420
    .line 421
    :cond_b
    const-string v2, ""

    .line 422
    .line 423
    :goto_7
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 424
    .line 425
    .line 426
    move-result v10

    .line 427
    move/from16 v29, v10

    .line 428
    .line 429
    const-string v10, "image_all"

    .line 430
    .line 431
    move-object/from16 v30, v1

    .line 432
    .line 433
    const-string v1, "audio"

    .line 434
    .line 435
    move-object/from16 v31, v11

    .line 436
    .line 437
    const-string v11, "video_all"

    .line 438
    .line 439
    if-eqz v29, :cond_11

    .line 440
    .line 441
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    check-cast v2, Ljava/lang/String;

    .line 446
    .line 447
    move-object/from16 v29, v4

    .line 448
    .line 449
    const/4 v4, 0x0

    .line 450
    invoke-static {v2, v5, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 451
    .line 452
    .line 453
    move-result v32

    .line 454
    if-eqz v32, :cond_c

    .line 455
    .line 456
    move-object v2, v10

    .line 457
    goto :goto_9

    .line 458
    :cond_c
    invoke-static {v2, v14, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 459
    .line 460
    .line 461
    move-result v10

    .line 462
    if-eqz v10, :cond_d

    .line 463
    .line 464
    move-object v2, v14

    .line 465
    goto :goto_9

    .line 466
    :cond_d
    invoke-static {v2, v7, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 467
    .line 468
    .line 469
    move-result v10

    .line 470
    if-eqz v10, :cond_e

    .line 471
    .line 472
    move-object v2, v11

    .line 473
    goto :goto_9

    .line 474
    :cond_e
    invoke-static {v2, v12, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 475
    .line 476
    .line 477
    move-result v10

    .line 478
    if-eqz v10, :cond_f

    .line 479
    .line 480
    move-object v2, v12

    .line 481
    goto :goto_9

    .line 482
    :cond_f
    invoke-static {v2, v1, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    if-eqz v2, :cond_10

    .line 487
    .line 488
    :goto_8
    move-object v2, v1

    .line 489
    goto :goto_9

    .line 490
    :cond_10
    const-string v1, "all"

    .line 491
    .line 492
    goto :goto_8

    .line 493
    :goto_9
    move-object/from16 v4, v29

    .line 494
    .line 495
    move-object/from16 v1, v30

    .line 496
    .line 497
    move-object/from16 v11, v31

    .line 498
    .line 499
    goto :goto_7

    .line 500
    :cond_11
    move-object/from16 v29, v4

    .line 501
    .line 502
    const/4 v4, 0x0

    .line 503
    invoke-static {v2, v14, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    if-eqz v4, :cond_15

    .line 508
    .line 509
    if-eqz v17, :cond_12

    .line 510
    .line 511
    invoke-virtual {v2, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    if-eqz v1, :cond_12

    .line 516
    .line 517
    move-object/from16 v1, v22

    .line 518
    .line 519
    goto/16 :goto_b

    .line 520
    .line 521
    :cond_12
    if-eqz v17, :cond_13

    .line 522
    .line 523
    move-object/from16 v1, v21

    .line 524
    .line 525
    goto :goto_b

    .line 526
    :cond_13
    invoke-virtual/range {p3 .. p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    .line 527
    .line 528
    .line 529
    move-result v1

    .line 530
    const/4 v2, 0x1

    .line 531
    if-ne v1, v2, :cond_14

    .line 532
    .line 533
    move-object v1, v6

    .line 534
    goto :goto_b

    .line 535
    :cond_14
    move-object v1, v0

    .line 536
    goto :goto_b

    .line 537
    :cond_15
    if-eqz v17, :cond_16

    .line 538
    .line 539
    invoke-virtual {v2, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    move-result v4

    .line 543
    if-eqz v4, :cond_16

    .line 544
    .line 545
    move-object/from16 v1, v18

    .line 546
    .line 547
    goto :goto_b

    .line 548
    :cond_16
    invoke-virtual {v2, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v4

    .line 552
    if-nez v4, :cond_17

    .line 553
    .line 554
    invoke-virtual {v2, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v4

    .line 558
    if-eqz v4, :cond_18

    .line 559
    .line 560
    :cond_17
    const/4 v2, 0x1

    .line 561
    goto :goto_a

    .line 562
    :cond_18
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    if-eqz v1, :cond_19

    .line 567
    .line 568
    move-object v1, v15

    .line 569
    goto :goto_b

    .line 570
    :cond_19
    invoke-virtual/range {p3 .. p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    .line 571
    .line 572
    .line 573
    move-result v1

    .line 574
    const/4 v2, 0x1

    .line 575
    if-ne v1, v2, :cond_1b

    .line 576
    .line 577
    if-eqz v17, :cond_1a

    .line 578
    .line 579
    move-object/from16 v1, v27

    .line 580
    .line 581
    goto :goto_b

    .line 582
    :cond_1a
    move-object/from16 v1, v30

    .line 583
    .line 584
    goto :goto_b

    .line 585
    :cond_1b
    move-object v1, v13

    .line 586
    goto :goto_b

    .line 587
    :goto_a
    if-eqz v17, :cond_1c

    .line 588
    .line 589
    move-object/from16 v1, v26

    .line 590
    .line 591
    goto :goto_b

    .line 592
    :cond_1c
    invoke-virtual/range {p3 .. p3}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    .line 593
    .line 594
    .line 595
    move-result v1

    .line 596
    if-ne v1, v2, :cond_1d

    .line 597
    .line 598
    move-object/from16 v1, v31

    .line 599
    .line 600
    goto :goto_b

    .line 601
    :cond_1d
    move-object v1, v9

    .line 602
    :goto_b
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 603
    .line 604
    .line 605
    move-result v2

    .line 606
    const/4 v4, 0x0

    .line 607
    const-string v10, "android.permission.CAMERA"

    .line 608
    .line 609
    sparse-switch v2, :sswitch_data_0

    .line 610
    .line 611
    .line 612
    goto/16 :goto_d

    .line 613
    .line 614
    :sswitch_0
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    move-result v0

    .line 618
    if-nez v0, :cond_1e

    .line 619
    .line 620
    goto/16 :goto_d

    .line 621
    .line 622
    :cond_1e
    iget-object v0, v3, LR4/k1;->V:Lj5/b;

    .line 623
    .line 624
    iget-object v1, v0, Lj5/b;->e:LP5/S;

    .line 625
    .line 626
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 627
    .line 628
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v1, v4, v2}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    iget-object v1, v0, Lj5/b;->c:LP5/S;

    .line 635
    .line 636
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 637
    .line 638
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v1, v4, v2}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    iget-object v1, v0, Lj5/b;->d:LP5/S;

    .line 645
    .line 646
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v1, v4, v2}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    invoke-virtual {v0}, Lj5/b;->e()V

    .line 653
    .line 654
    .line 655
    :goto_c
    const/4 v2, 0x1

    .line 656
    goto/16 :goto_e

    .line 657
    .line 658
    :sswitch_1
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    if-nez v0, :cond_1f

    .line 663
    .line 664
    goto/16 :goto_d

    .line 665
    .line 666
    :cond_1f
    invoke-virtual {v8, v5}, Le/g;->u(Ljava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    goto :goto_c

    .line 670
    :sswitch_2
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    move-result v0

    .line 674
    if-nez v0, :cond_20

    .line 675
    .line 676
    goto/16 :goto_d

    .line 677
    .line 678
    :cond_20
    invoke-virtual {v8, v7}, Le/g;->u(Ljava/lang/Object;)V

    .line 679
    .line 680
    .line 681
    goto :goto_c

    .line 682
    :sswitch_3
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result v0

    .line 686
    if-nez v0, :cond_21

    .line 687
    .line 688
    goto/16 :goto_d

    .line 689
    .line 690
    :cond_21
    iget-object v0, v3, LR4/k1;->V:Lj5/b;

    .line 691
    .line 692
    invoke-virtual {v0}, Lj5/b;->f()V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v0}, Lj5/b;->g()V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v0}, Lj5/b;->e()V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v0}, Lj5/b;->c()V

    .line 702
    .line 703
    .line 704
    goto :goto_c

    .line 705
    :sswitch_4
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 706
    .line 707
    .line 708
    move-result v0

    .line 709
    if-nez v0, :cond_22

    .line 710
    .line 711
    goto/16 :goto_d

    .line 712
    .line 713
    :cond_22
    move-object/from16 v4, v29

    .line 714
    .line 715
    invoke-virtual {v4, v5}, Le/g;->u(Ljava/lang/Object;)V

    .line 716
    .line 717
    .line 718
    goto :goto_c

    .line 719
    :sswitch_5
    move-object/from16 v4, v29

    .line 720
    .line 721
    move-object/from16 v0, v31

    .line 722
    .line 723
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    if-nez v0, :cond_23

    .line 728
    .line 729
    goto/16 :goto_d

    .line 730
    .line 731
    :cond_23
    invoke-virtual {v4, v7}, Le/g;->u(Ljava/lang/Object;)V

    .line 732
    .line 733
    .line 734
    goto :goto_c

    .line 735
    :sswitch_6
    move-object/from16 v4, v29

    .line 736
    .line 737
    move-object/from16 v0, v30

    .line 738
    .line 739
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    move-result v0

    .line 743
    if-nez v0, :cond_24

    .line 744
    .line 745
    goto/16 :goto_d

    .line 746
    .line 747
    :cond_24
    move-object/from16 v0, v28

    .line 748
    .line 749
    invoke-virtual {v4, v0}, Le/g;->u(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    goto :goto_c

    .line 753
    :sswitch_7
    move-object/from16 v0, v27

    .line 754
    .line 755
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 756
    .line 757
    .line 758
    move-result v0

    .line 759
    if-nez v0, :cond_25

    .line 760
    .line 761
    goto/16 :goto_d

    .line 762
    .line 763
    :cond_25
    iget-object v0, v3, LR4/k1;->V:Lj5/b;

    .line 764
    .line 765
    invoke-virtual {v0}, Lj5/b;->f()V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v0}, Lj5/b;->g()V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v0}, Lj5/b;->e()V

    .line 772
    .line 773
    .line 774
    invoke-virtual {v0}, Lj5/b;->c()V

    .line 775
    .line 776
    .line 777
    goto :goto_c

    .line 778
    :sswitch_8
    move-object/from16 v0, v26

    .line 779
    .line 780
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    move-result v0

    .line 784
    if-nez v0, :cond_26

    .line 785
    .line 786
    goto/16 :goto_d

    .line 787
    .line 788
    :cond_26
    move-object/from16 v0, v25

    .line 789
    .line 790
    iget-object v0, v0, LR4/k1;->S:Lg5/h;

    .line 791
    .line 792
    iput-object v1, v0, Lg5/h;->p:Ljava/lang/String;

    .line 793
    .line 794
    move-object/from16 v5, v24

    .line 795
    .line 796
    invoke-static {v5, v10}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 797
    .line 798
    .line 799
    move-result v0

    .line 800
    if-nez v0, :cond_27

    .line 801
    .line 802
    move-object/from16 v7, v20

    .line 803
    .line 804
    invoke-virtual {v7, v12}, Le/g;->u(Ljava/lang/Object;)V

    .line 805
    .line 806
    .line 807
    goto/16 :goto_c

    .line 808
    .line 809
    :cond_27
    move-object/from16 v6, v19

    .line 810
    .line 811
    invoke-virtual {v6, v10}, Le/g;->u(Ljava/lang/Object;)V

    .line 812
    .line 813
    .line 814
    goto/16 :goto_c

    .line 815
    .line 816
    :sswitch_9
    move-object/from16 v2, v23

    .line 817
    .line 818
    move-object/from16 v0, v28

    .line 819
    .line 820
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result v1

    .line 824
    if-nez v1, :cond_28

    .line 825
    .line 826
    goto :goto_d

    .line 827
    :cond_28
    invoke-virtual {v8, v0}, Le/g;->u(Ljava/lang/Object;)V

    .line 828
    .line 829
    .line 830
    goto/16 :goto_c

    .line 831
    .line 832
    :sswitch_a
    move-object/from16 v0, v18

    .line 833
    .line 834
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 835
    .line 836
    .line 837
    move-result v0

    .line 838
    if-nez v0, :cond_29

    .line 839
    .line 840
    goto :goto_d

    .line 841
    :cond_29
    iget-object v0, v3, LR4/k1;->V:Lj5/b;

    .line 842
    .line 843
    iget-object v1, v0, Lj5/b;->c:LP5/S;

    .line 844
    .line 845
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 846
    .line 847
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v1, v4, v2}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 851
    .line 852
    .line 853
    invoke-virtual {v0}, Lj5/b;->c()V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v0}, Lj5/b;->e()V

    .line 857
    .line 858
    .line 859
    goto/16 :goto_c

    .line 860
    .line 861
    :sswitch_b
    move-object/from16 v0, v22

    .line 862
    .line 863
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 864
    .line 865
    .line 866
    move-result v0

    .line 867
    if-nez v0, :cond_2a

    .line 868
    .line 869
    goto :goto_d

    .line 870
    :cond_2a
    iget-object v0, v3, LR4/k1;->V:Lj5/b;

    .line 871
    .line 872
    iget-object v1, v0, Lj5/b;->d:LP5/S;

    .line 873
    .line 874
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 875
    .line 876
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 877
    .line 878
    .line 879
    invoke-virtual {v1, v4, v2}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 880
    .line 881
    .line 882
    invoke-virtual {v0}, Lj5/b;->c()V

    .line 883
    .line 884
    .line 885
    invoke-virtual {v0}, Lj5/b;->e()V

    .line 886
    .line 887
    .line 888
    goto/16 :goto_c

    .line 889
    .line 890
    :sswitch_c
    move-object/from16 v6, v19

    .line 891
    .line 892
    move-object/from16 v7, v20

    .line 893
    .line 894
    move-object/from16 v2, v21

    .line 895
    .line 896
    move-object/from16 v5, v24

    .line 897
    .line 898
    move-object/from16 v0, v25

    .line 899
    .line 900
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v2

    .line 904
    if-nez v2, :cond_2b

    .line 905
    .line 906
    :goto_d
    goto/16 :goto_c

    .line 907
    .line 908
    :cond_2b
    iget-object v0, v0, LR4/k1;->S:Lg5/h;

    .line 909
    .line 910
    iput-object v1, v0, Lg5/h;->p:Ljava/lang/String;

    .line 911
    .line 912
    invoke-static {v5, v10}, Lk1/c;->a(Landroid/content/Context;Ljava/lang/String;)I

    .line 913
    .line 914
    .line 915
    move-result v0

    .line 916
    if-nez v0, :cond_2c

    .line 917
    .line 918
    invoke-virtual {v7, v14}, Le/g;->u(Ljava/lang/Object;)V

    .line 919
    .line 920
    .line 921
    goto/16 :goto_c

    .line 922
    .line 923
    :cond_2c
    invoke-virtual {v6, v10}, Le/g;->u(Ljava/lang/Object;)V

    .line 924
    .line 925
    .line 926
    goto/16 :goto_c

    .line 927
    .line 928
    :goto_e
    return v2

    .line 929
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch

    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    :sswitch_data_0
    .sparse-switch
        -0x773638de -> :sswitch_c
        -0x5a5c8674 -> :sswitch_b
        -0x59a71b54 -> :sswitch_a
        -0x425b156f -> :sswitch_9
        -0x3ac799de -> :sswitch_8
        -0x35147eea -> :sswitch_7
        -0x34222984 -> :sswitch_6
        0x6b21eda -> :sswitch_5
        0x112195fa -> :sswitch_4
        0x2ab8fc9e -> :sswitch_3
        0x5186d462 -> :sswitch_2
        0x5bf64b82 -> :sswitch_1
        0x6bb72f07 -> :sswitch_0
    .end sparse-switch
.end method
