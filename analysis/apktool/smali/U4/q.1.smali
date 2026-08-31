.class public final LU4/q;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:LR4/k1;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LR4/k1;Landroid/content/Context;LP/W;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LU4/q;->a:I

    iput-object p1, p0, LU4/q;->b:LR4/k1;

    iput-object p2, p0, LU4/q;->c:Ljava/lang/Object;

    iput-object p3, p0, LU4/q;->d:Ljava/lang/Object;

    .line 12
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method public constructor <init>(LR4/k1;Lk5/b;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LU4/q;->a:I

    .line 10
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    iput-object p1, p0, LU4/q;->b:LR4/k1;

    iput-object p2, p0, LU4/q;->c:Ljava/lang/Object;

    .line 11
    new-instance p2, LZ/m;

    invoke-direct {p2, p1}, LZ/m;-><init>(LR4/k1;)V

    iput-object p2, p0, LU4/q;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/webkit/WebView;LR4/k1;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, LU4/q;->a:I

    .line 1
    new-instance v0, LZ2/c;

    invoke-direct {v0}, LZ2/c;-><init>()V

    .line 2
    const-string v1, "dataObjects"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    .line 4
    iput-object v0, p0, LU4/q;->c:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, LU4/q;->b:LR4/k1;

    .line 6
    new-instance p2, LZ2/b;

    invoke-direct {p2, p1}, LZ2/b;-><init>(Landroid/webkit/WebView;)V

    iput-object p2, p0, LU4/q;->d:Ljava/lang/Object;

    .line 7
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object p1

    const-string p2, "getSettings(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x1

    .line 8
    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 9
    invoke-virtual {p1, p2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    return-void
.end method


# virtual methods
.method public doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget v0, p0, LU4/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->doUpdateVisitedHistory(Landroid/webkit/WebView;Ljava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, LU4/q;->b:LR4/k1;

    .line 11
    .line 12
    iget-object p3, p1, LR4/k1;->d:LR4/i;

    .line 13
    .line 14
    if-eqz p3, :cond_0

    .line 15
    .line 16
    iget-object p3, p3, LR4/i;->V:LR4/I1;

    .line 17
    .line 18
    if-eqz p3, :cond_0

    .line 19
    .line 20
    iget-object p3, p3, LR4/I1;->a:Ljava/lang/Boolean;

    .line 21
    .line 22
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p3, 0x0

    .line 30
    :goto_0
    const/4 v0, 0x0

    .line 31
    if-nez p3, :cond_2

    .line 32
    .line 33
    iget-object p3, p1, LR4/k1;->d:LR4/i;

    .line 34
    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    iget-object p3, p3, LR4/i;->V:LR4/I1;

    .line 38
    .line 39
    if-eqz p3, :cond_1

    .line 40
    .line 41
    iget-object p3, p3, LR4/I1;->b:Ljava/lang/String;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object p3, v0

    .line 45
    :goto_1
    invoke-static {p2, p3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    iget-object p2, p1, LR4/k1;->S:Lg5/h;

    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    :cond_2
    iget-object p1, p1, LR4/k1;->t:Lj5/d;

    .line 57
    .line 58
    iget-object p1, p1, Lj5/d;->j:LP5/S;

    .line 59
    .line 60
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0, p2}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget v0, p0, LU4/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LU4/q;->b:LR4/k1;

    .line 14
    .line 15
    iget-object p1, p1, LR4/k1;->M:LO3/e0;

    .line 16
    .line 17
    invoke-virtual {p1}, LO3/e0;->b()Z

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget v0, p0, LU4/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    const-string v0, "view"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "url"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iget-object v1, p0, LU4/q;->b:LR4/k1;

    .line 25
    .line 26
    iput-boolean v0, v1, LR4/k1;->y:Z

    .line 27
    .line 28
    invoke-static {p1, v1}, Lcom/google/android/gms/internal/measurement/K1;->v(Landroid/webkit/WebView;LR4/k1;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "window.navigator.share = function (obj) {return new Promise((resolve, reject) => {window.WebToNativeInterface.share(JSON.stringify(obj));resolve();});};"

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-virtual {p1, v0, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 35
    .line 36
    .line 37
    const-string v0, "window.navigator.canShare = function(data = {}) { return Boolean(        data.text ||         data.url ||         data.title ||         (Array.isArray(data.files) &&          data.files.length > 0 &&          data.files.every(file => file instanceof File))    ); };"

    .line 38
    .line 39
    invoke-virtual {p1, v0, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 40
    .line 41
    .line 42
    const-string v0, "window.print = function () {  try{if(window.WebToNativeInterface.createWebPagePrint){window.WebToNativeInterface.createWebPagePrint()}}catch(e){}};"

    .line 43
    .line 44
    invoke-virtual {p1, v0, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 45
    .line 46
    .line 47
    const-string v0, "document.addEventListener(\'scroll\', (event) => {  let scrollElement = event.target;  if (scrollElement === document || scrollElement === document.documentElement || scrollElement === document.body) {  } else {        if (window.scrollY === 0 && scrollElement.scrollTop != 0) {            window.scrollTo(0, 1)        }    }}, true);"

    .line 48
    .line 49
    invoke-virtual {p1, v0, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 50
    .line 51
    .line 52
    const-string v0, "logalert();"

    .line 53
    .line 54
    invoke-virtual {p1, v0, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, LU4/q;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Lk5/b;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object p1, p1, Lk5/b;->f:Landroidx/lifecycle/J;

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroidx/lifecycle/G;->k(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iput-object v2, v1, LR4/k1;->p:Ljava/lang/Boolean;

    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_2
    if-eqz p2, :cond_5

    .line 73
    .line 74
    new-instance p1, Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, LU4/q;->b:LR4/k1;

    .line 80
    .line 81
    iget-object v1, v0, LR4/k1;->d:LR4/i;

    .line 82
    .line 83
    const/4 v2, 0x0

    .line 84
    if-eqz v1, :cond_0

    .line 85
    .line 86
    iget-object v3, v1, LR4/i;->p:LR4/w1;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    move-object v3, v2

    .line 90
    :goto_0
    if-eqz v3, :cond_4

    .line 91
    .line 92
    if-eqz v1, :cond_1

    .line 93
    .line 94
    iget-object v3, v1, LR4/i;->p:LR4/w1;

    .line 95
    .line 96
    if-eqz v3, :cond_1

    .line 97
    .line 98
    iget-object v3, v3, LR4/w1;->b:Ljava/util/List;

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    move-object v3, v2

    .line 102
    :goto_1
    if-eqz v3, :cond_4

    .line 103
    .line 104
    if-eqz v1, :cond_2

    .line 105
    .line 106
    iget-object v1, v1, LR4/i;->p:LR4/w1;

    .line 107
    .line 108
    if-eqz v1, :cond_2

    .line 109
    .line 110
    iget-object v2, v1, LR4/w1;->b:Ljava/util/List;

    .line 111
    .line 112
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    move-object v1, v2

    .line 116
    check-cast v1, Ljava/util/Collection;

    .line 117
    .line 118
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    const/4 v3, 0x0

    .line 123
    :goto_2
    if-ge v3, v1, :cond_4

    .line 124
    .line 125
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, LR4/o3;

    .line 130
    .line 131
    iget-object v4, v4, LR4/o3;->a:Ljava/lang/String;

    .line 132
    .line 133
    if-eqz v4, :cond_3

    .line 134
    .line 135
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_4
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_5

    .line 146
    .line 147
    invoke-static {p1, p2}, Ly4/b;->x(Ljava/util/ArrayList;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    const/4 p2, -0x1

    .line 152
    if-eq p1, p2, :cond_5

    .line 153
    .line 154
    iget-object p1, v0, LR4/k1;->e:LT1/u;

    .line 155
    .line 156
    if-eqz p1, :cond_5

    .line 157
    .line 158
    invoke-virtual {p1}, LT1/u;->c()V

    .line 159
    .line 160
    .line 161
    :cond_5
    return-void

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 4

    .line 1
    iget v0, p0, LU4/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object v0, p0, LU4/q;->b:LR4/k1;

    .line 11
    .line 12
    iget-object v1, v0, LR4/k1;->M:LO3/e0;

    .line 13
    .line 14
    invoke-virtual {v1}, LO3/e0;->b()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_9

    .line 19
    .line 20
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 21
    .line 22
    .line 23
    iget-object p3, v0, LR4/k1;->d:LR4/i;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz p3, :cond_0

    .line 27
    .line 28
    iget-object p3, p3, LR4/i;->V:LR4/I1;

    .line 29
    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    iget-object p3, p3, LR4/I1;->a:Ljava/lang/Boolean;

    .line 33
    .line 34
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-static {p3, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move p3, v1

    .line 42
    :goto_0
    const/4 v2, 0x0

    .line 43
    if-nez p3, :cond_3

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move-object p3, v2

    .line 53
    :goto_1
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    iget-object v3, v0, LR4/k1;->d:LR4/i;

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    iget-object v3, v3, LR4/i;->V:LR4/I1;

    .line 62
    .line 63
    if-eqz v3, :cond_2

    .line 64
    .line 65
    iget-object v3, v3, LR4/I1;->b:Ljava/lang/String;

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    move-object v3, v2

    .line 69
    :goto_2
    invoke-virtual {p3, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    if-eqz p3, :cond_3

    .line 74
    .line 75
    iget-object p3, v0, LR4/k1;->S:Lg5/h;

    .line 76
    .line 77
    const-string v3, "notification"

    .line 78
    .line 79
    invoke-virtual {p3, v3, v1}, Lg5/h;->f(Ljava/lang/String;Z)V

    .line 80
    .line 81
    .line 82
    :cond_3
    if-eqz p1, :cond_4

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_4

    .line 89
    .line 90
    const-string p3, "gis_transform"

    .line 91
    .line 92
    invoke-static {p1, p3}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    const/4 p3, 0x1

    .line 97
    if-ne p1, p3, :cond_4

    .line 98
    .line 99
    move v1, p3

    .line 100
    :cond_4
    if-eqz v1, :cond_7

    .line 101
    .line 102
    iget-object p1, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 103
    .line 104
    if-eqz p1, :cond_5

    .line 105
    .line 106
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 107
    .line 108
    .line 109
    :cond_5
    iget-object p1, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 110
    .line 111
    if-eqz p1, :cond_6

    .line 112
    .line 113
    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    .line 114
    .line 115
    .line 116
    :cond_6
    iput-object p2, v0, LR4/k1;->A:Ljava/lang/String;

    .line 117
    .line 118
    iget-object p1, v0, LR4/k1;->e:LT1/u;

    .line 119
    .line 120
    if-eqz p1, :cond_7

    .line 121
    .line 122
    const-string p3, "googleGsiLoginScreen"

    .line 123
    .line 124
    invoke-static {p1, p3}, LT1/u;->b(LT1/u;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :cond_7
    iget-object p1, p0, LU4/q;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast p1, Lk5/b;

    .line 130
    .line 131
    if-eqz p2, :cond_8

    .line 132
    .line 133
    iget-object p1, p1, Lk5/b;->d:LP5/S;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v2, p2}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_9
    if-eqz p1, :cond_a

    .line 147
    .line 148
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 149
    .line 150
    .line 151
    :cond_a
    iget-object p1, v0, LR4/k1;->k:Landroid/webkit/WebView;

    .line 152
    .line 153
    if-eqz p1, :cond_b

    .line 154
    .line 155
    invoke-virtual {p1}, Landroid/webkit/WebView;->stopLoading()V

    .line 156
    .line 157
    .line 158
    :cond_b
    :goto_3
    return-void

    .line 159
    :pswitch_1
    const-string v0, "view"

    .line 160
    .line 161
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    const-string v0, "url"

    .line 165
    .line 166
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string v0, "Page started loading, enabling request inspection. URL: "

    .line 170
    .line 171
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    const-string v1, "RequestInspectorWebView"

    .line 176
    .line 177
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    .line 179
    .line 180
    iget-object v0, p0, LU4/q;->c:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v0, LZ2/c;

    .line 183
    .line 184
    iget-object v0, v0, LZ2/c;->a:Ljava/lang/String;

    .line 185
    .line 186
    const-string v1, "extraJavaScriptToInject"

    .line 187
    .line 188
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    const-string v1, "javascript: \nfunction getFullUrl(url) {\n    if (url.startsWith(\"/\")) {\n        return location.protocol + \'//\' + location.host + url;\n    } else {\n        return url;\n    }\n}\n\nfunction recordFormSubmission(form) {\n    var jsonArr = [];\n    for (i = 0; i < form.elements.length; i++) {\n        var parName = form.elements[i].name;\n        var parValue = form.elements[i].value;\n        var parType = form.elements[i].type;\n        var parChecked = form.elements[i].checked;\n        var parId = form.elements[i].id;\n\n        jsonArr.push({\n            name: parName,\n            value: parValue,\n            type: parType,\n            checked:parChecked,\n            id:parId\n        });\n    }\n\n    const path = form.attributes[\'action\'] === undefined ? \"/\" : form.attributes[\'action\'].nodeValue;\n    const method = form.attributes[\'method\'] === undefined ? \"GET\" : form.attributes[\'method\'].nodeValue;\n    const url = getFullUrl(path);\n    const encType = form.attributes[\'enctype\'] === undefined ? \"application/x-www-form-urlencoded\" : form.attributes[\'enctype\'].nodeValue;\n    const err = new Error();\n    RequestInspection.recordFormSubmission(\n        url,\n        method,\n        JSON.stringify(jsonArr),\n        \"{}\",\n        err.stack,\n        encType\n    );\n}\n\nfunction handleFormSubmission(e) {\n    const form = e ? e.target : this;\n    recordFormSubmission(form);\n    form._submit();\n}\n\nHTMLFormElement.prototype._submit = HTMLFormElement.prototype.submit;\nHTMLFormElement.prototype.submit = handleFormSubmission;\nwindow.addEventListener(\'submit\', function (submitEvent) {\n    const form = submitEvent ? submitEvent.target : this;\n    recordFormSubmission(form);\n}, true);\n\nlet lastXmlhttpRequestPrototypeMethod = null;\nlet xmlhttpRequestHeaders = {};\nlet xmlhttpRequestUrl = null;\nXMLHttpRequest.prototype._open = XMLHttpRequest.prototype.open;\nXMLHttpRequest.prototype.open = function (method, url, async, user, password) {\n    lastXmlhttpRequestPrototypeMethod = method;\n    xmlhttpRequestUrl = url;\n    const asyncWithDefault = async === undefined ? true : async;\n    this._open(method, url, asyncWithDefault, user, password);\n};\nXMLHttpRequest.prototype._setRequestHeader = XMLHttpRequest.prototype.setRequestHeader;\nXMLHttpRequest.prototype.setRequestHeader = function (header, value) {\n    xmlhttpRequestHeaders[header] = value;\n    this._setRequestHeader(header, value);\n};\nXMLHttpRequest.prototype._send = XMLHttpRequest.prototype.send;\nXMLHttpRequest.prototype.send = function (body) {\n    const err = new Error();\n    const url = getFullUrl(xmlhttpRequestUrl);\n    RequestInspection.recordXhr(\n        url,\n        lastXmlhttpRequestPrototypeMethod,\n        body || \"\",\n        JSON.stringify(xmlhttpRequestHeaders),\n        err.stack\n    );\n    lastXmlhttpRequestPrototypeMethod = null;\n    xmlhttpRequestUrl = null;\n    xmlhttpRequestHeaders = {};\n    this._send(body);\n};\n\nwindow._fetch = window.fetch;\nwindow.fetch = function () {\n    const firstArgument = arguments[0];\n    let url;\n    let method;\n    let body;\n    let headers;\n    if (typeof firstArgument === \'string\') {\n        url = firstArgument;\n        method = arguments[1] && \'method\' in arguments[1] ? arguments[1][\'method\'] : \"GET\";\n        body = arguments[1] && \'body\' in arguments[1] ? arguments[1][\'body\'] : \"\";\n        headers = JSON.stringify(arguments[1] && \'headers\' in arguments[1] ? arguments[1][\'headers\'] : {});\n    } else {\n        // Request object\n        url = firstArgument.url;\n        method = firstArgument.method;\n        body = firstArgument.body;\n        headers = JSON.stringify(Object.fromEntries(firstArgument.headers.entries()));\n    }\n    const fullUrl = getFullUrl(url);\n    const err = new Error();\n    RequestInspection.recordFetch(fullUrl, method, body, headers, err.stack);\n    return window._fetch.apply(this, arguments);\n}\n        \n"

    .line 192
    .line 193
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    const/4 v1, 0x0

    .line 198
    invoke-virtual {p1, v0, v1}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 199
    .line 200
    .line 201
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 1

    .line 1
    iget v0, p0, LU4/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    if-eqz p3, :cond_0

    .line 11
    .line 12
    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V

    .line 23
    .line 24
    .line 25
    if-eqz p3, :cond_1

    .line 26
    .line 27
    const-string p1, "dataObject"

    .line 28
    .line 29
    iget-object p2, p0, LU4/q;->b:LR4/k1;

    .line 30
    .line 31
    invoke-static {p2, p1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p2, LR4/k1;->M:LO3/e0;

    .line 35
    .line 36
    iput-object v0, p1, LO3/e0;->c:Ljava/lang/String;

    .line 37
    .line 38
    :cond_1
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public onReceivedHttpAuthRequest(Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget v0, p0, LU4/q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedHttpAuthRequest(Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const/4 p4, 0x0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, p4

    .line 19
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ","

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    const-string v0, "onReceivedHttpAuthRequest"

    .line 40
    .line 41
    invoke-static {v0, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    new-instance p3, Lk3/c;

    .line 45
    .line 46
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p2, p3, Lk3/c;->q:Ljava/lang/Object;

    .line 50
    .line 51
    new-instance p2, Landroid/app/AlertDialog$Builder;

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move-object v0, p4

    .line 61
    :goto_1
    invoke-direct {p2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 62
    .line 63
    .line 64
    const-string v0, "Authentication Required"

    .line 65
    .line 66
    invoke-virtual {p2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 67
    .line 68
    .line 69
    const-string v0, "Enter your credentials"

    .line 70
    .line 71
    invoke-virtual {p2, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 72
    .line 73
    .line 74
    new-instance v0, Landroid/widget/EditText;

    .line 75
    .line 76
    if-eqz p1, :cond_2

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    goto :goto_2

    .line 83
    :cond_2
    move-object v1, p4

    .line 84
    :goto_2
    invoke-direct {v0, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 85
    .line 86
    .line 87
    const-string v1, "Username"

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 90
    .line 91
    .line 92
    new-instance v1, Landroid/widget/EditText;

    .line 93
    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    goto :goto_3

    .line 101
    :cond_3
    move-object v2, p4

    .line 102
    :goto_3
    invoke-direct {v1, v2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    const-string v2, "Password"

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    const/16 v2, 0x81

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setInputType(I)V

    .line 113
    .line 114
    .line 115
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 116
    .line 117
    const/4 v3, -0x1

    .line 118
    const/4 v4, -0x2

    .line 119
    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 120
    .line 121
    .line 122
    const/16 v3, 0x28

    .line 123
    .line 124
    const/4 v4, 0x0

    .line 125
    invoke-virtual {v2, v3, v4, v3, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 126
    .line 127
    .line 128
    new-instance v3, Landroid/widget/LinearLayout;

    .line 129
    .line 130
    if-eqz p1, :cond_4

    .line 131
    .line 132
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 133
    .line 134
    .line 135
    move-result-object p4

    .line 136
    :cond_4
    invoke-direct {v3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 137
    .line 138
    .line 139
    const/4 p1, 0x1

    .line 140
    invoke-virtual {v3, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 150
    .line 151
    .line 152
    new-instance p1, LR4/f3;

    .line 153
    .line 154
    const/4 p4, 0x0

    .line 155
    invoke-direct {p1, v0, v1, p3, p4}, LR4/f3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 156
    .line 157
    .line 158
    const-string p4, "OK"

    .line 159
    .line 160
    invoke-virtual {p2, p4, p1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 161
    .line 162
    .line 163
    new-instance p1, LR4/g3;

    .line 164
    .line 165
    const/4 p4, 0x0

    .line 166
    invoke-direct {p1, p4, p3}, LR4/g3;-><init>(ILjava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    const-string p3, "Cancel"

    .line 170
    .line 171
    invoke-virtual {p2, p3, p1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    nop

    .line 179
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    iget v2, v1, LU4/q;->a:I

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v2, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-super/range {p0 .. p2}, Landroid/webkit/WebViewClient;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :pswitch_0
    iget-object v2, v1, LU4/q;->b:LR4/k1;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v0, v3

    .line 26
    :goto_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :try_start_0
    iget-object v2, v2, LR4/k1;->d:LR4/i;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iget-object v4, v2, LR4/i;->N:LR4/P0;

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    iget-object v4, v4, LR4/P0;->c:Ljava/lang/String;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catch_0
    move-exception v0

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    move-object v4, v3

    .line 44
    :goto_1
    if-eqz v4, :cond_3

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    iget-object v2, v2, LR4/i;->N:LR4/P0;

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    iget-object v2, v2, LR4/P0;->c:Ljava/lang/String;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move-object v2, v3

    .line 56
    :goto_2
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    sget-object v0, LR4/V;->d:LR4/V;

    .line 66
    .line 67
    if-nez v0, :cond_3

    .line 68
    .line 69
    new-instance v0, LR4/V;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    sput-object v0, LR4/V;->d:LR4/V;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 78
    .line 79
    .line 80
    :cond_3
    :goto_4
    return-object v3

    .line 81
    :pswitch_1
    const-string v2, "view"

    .line 82
    .line 83
    move-object/from16 v4, p1

    .line 84
    .line 85
    invoke-static {v4, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const-string v2, "request"

    .line 89
    .line 90
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v2, v1, LU4/q;->d:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v2, LZ2/b;

    .line 96
    .line 97
    invoke-interface {v0}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v4}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    const-string v5, "toString(...)"

    .line 106
    .line 107
    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v5, v2, LZ2/b;->a:Ljava/util/ArrayList;

    .line 114
    .line 115
    monitor-enter v5

    .line 116
    :try_start_1
    iget-object v6, v2, LZ2/b;->a:Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    :cond_4
    invoke-interface {v6}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    if-eqz v7, :cond_5

    .line 131
    .line 132
    invoke-interface {v6}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    move-object v8, v7

    .line 137
    check-cast v8, LZ2/a;

    .line 138
    .line 139
    iget-object v8, v8, LZ2/a;->b:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    if-eqz v8, :cond_4

    .line 146
    .line 147
    goto :goto_5

    .line 148
    :catchall_0
    move-exception v0

    .line 149
    goto/16 :goto_f

    .line 150
    .line 151
    :cond_5
    move-object v7, v3

    .line 152
    :goto_5
    check-cast v7, LZ2/a;

    .line 153
    .line 154
    if-nez v7, :cond_8

    .line 155
    .line 156
    iget-object v2, v2, LZ2/b;->a:Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    :cond_6
    invoke-interface {v2}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    if-eqz v6, :cond_7

    .line 171
    .line 172
    invoke-interface {v2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    move-object v7, v6

    .line 177
    check-cast v7, LZ2/a;

    .line 178
    .line 179
    iget-object v7, v7, LZ2/a;->b:Ljava/lang/String;

    .line 180
    .line 181
    invoke-static {v4, v7}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    if-eqz v7, :cond_6

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_7
    move-object v6, v3

    .line 189
    :goto_6
    move-object v7, v6

    .line 190
    check-cast v7, LZ2/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 191
    .line 192
    :cond_8
    monitor-exit v5

    .line 193
    const-string v2, "toLowerCase(...)"

    .line 194
    .line 195
    const-string v4, ""

    .line 196
    .line 197
    if-eqz v7, :cond_9

    .line 198
    .line 199
    iget-object v5, v7, LZ2/a;->a:LZ2/f;

    .line 200
    .line 201
    :goto_7
    move-object v9, v5

    .line 202
    goto :goto_8

    .line 203
    :cond_9
    sget-object v5, LZ2/f;->t:LZ2/f;

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :goto_8
    invoke-interface {v0}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    invoke-virtual {v5}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    const-string v5, "toString(...)"

    .line 215
    .line 216
    invoke-static {v10, v5}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-virtual {v5, v10}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    if-nez v5, :cond_a

    .line 228
    .line 229
    move-object v5, v4

    .line 230
    :cond_a
    new-instance v14, Ljava/util/HashMap;

    .line 231
    .line 232
    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 233
    .line 234
    .line 235
    const-string v6, "cookie"

    .line 236
    .line 237
    invoke-virtual {v14, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    if-eqz v7, :cond_c

    .line 241
    .line 242
    iget-object v5, v7, LZ2/a;->f:Ljava/util/HashMap;

    .line 243
    .line 244
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 245
    .line 246
    invoke-virtual {v5}, Ljava/util/HashMap;->size()I

    .line 247
    .line 248
    .line 249
    move-result v8

    .line 250
    invoke-static {v8}, Ln5/y;->I(I)I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    invoke-direct {v6, v8}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v5}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    check-cast v5, Ljava/lang/Iterable;

    .line 262
    .line 263
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object v5

    .line 267
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    if-eqz v8, :cond_b

    .line 272
    .line 273
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    check-cast v8, Ljava/util/Map$Entry;

    .line 278
    .line 279
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v11

    .line 283
    check-cast v11, Ljava/lang/String;

    .line 284
    .line 285
    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 286
    .line 287
    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v11

    .line 291
    invoke-static {v11, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v8

    .line 298
    invoke-interface {v6, v11, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    goto :goto_9

    .line 302
    :cond_b
    invoke-virtual {v14, v6}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 303
    .line 304
    .line 305
    :cond_c
    invoke-interface {v0}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    const-string v6, "getRequestHeaders(...)"

    .line 310
    .line 311
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 315
    .line 316
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 317
    .line 318
    .line 319
    move-result v8

    .line 320
    invoke-static {v8}, Ln5/y;->I(I)I

    .line 321
    .line 322
    .line 323
    move-result v8

    .line 324
    invoke-direct {v6, v8}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 325
    .line 326
    .line 327
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    check-cast v5, Ljava/lang/Iterable;

    .line 332
    .line 333
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v8

    .line 341
    if-eqz v8, :cond_d

    .line 342
    .line 343
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v8

    .line 347
    check-cast v8, Ljava/util/Map$Entry;

    .line 348
    .line 349
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v11

    .line 353
    check-cast v11, Ljava/lang/String;

    .line 354
    .line 355
    invoke-static {v11}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 359
    .line 360
    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v11

    .line 364
    invoke-static {v11, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v8

    .line 371
    invoke-interface {v6, v11, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    goto :goto_a

    .line 375
    :cond_d
    invoke-virtual {v14, v6}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 376
    .line 377
    .line 378
    invoke-interface {v0}, Landroid/webkit/WebResourceRequest;->isRedirect()Z

    .line 379
    .line 380
    .line 381
    move-result v18

    .line 382
    invoke-interface {v0}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v11

    .line 386
    const-string v2, "getMethod(...)"

    .line 387
    .line 388
    invoke-static {v11, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    if-eqz v7, :cond_e

    .line 392
    .line 393
    iget-object v2, v7, LZ2/a;->d:Ljava/lang/String;

    .line 394
    .line 395
    move-object v12, v2

    .line 396
    goto :goto_b

    .line 397
    :cond_e
    move-object v12, v4

    .line 398
    :goto_b
    if-eqz v7, :cond_f

    .line 399
    .line 400
    iget-object v4, v7, LZ2/a;->g:Ljava/lang/String;

    .line 401
    .line 402
    :cond_f
    move-object v15, v4

    .line 403
    if-eqz v7, :cond_10

    .line 404
    .line 405
    iget-object v2, v7, LZ2/a;->h:Ljava/lang/String;

    .line 406
    .line 407
    move-object/from16 v16, v2

    .line 408
    .line 409
    goto :goto_c

    .line 410
    :cond_10
    move-object/from16 v16, v3

    .line 411
    .line 412
    :goto_c
    invoke-interface {v0}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    .line 413
    .line 414
    .line 415
    move-result v17

    .line 416
    invoke-interface {v0}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    .line 417
    .line 418
    .line 419
    move-result v19

    .line 420
    if-eqz v7, :cond_11

    .line 421
    .line 422
    iget-object v0, v7, LZ2/a;->e:Ljava/lang/Object;

    .line 423
    .line 424
    :goto_d
    move-object v13, v0

    .line 425
    goto :goto_e

    .line 426
    :cond_11
    sget-object v0, Ln5/t;->q:Ln5/t;

    .line 427
    .line 428
    goto :goto_d

    .line 429
    :goto_e
    new-instance v8, LZ2/e;

    .line 430
    .line 431
    invoke-direct/range {v8 .. v19}, LZ2/e;-><init>(LZ2/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v8}, LZ2/e;->toString()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    const-string v2, "id_token"

    .line 439
    .line 440
    invoke-static {v0, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-eqz v0, :cond_12

    .line 445
    .line 446
    invoke-interface {v13, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    check-cast v0, Ljava/lang/String;

    .line 451
    .line 452
    sget-object v2, LM5/H;->a:LT5/e;

    .line 453
    .line 454
    sget-object v2, LR5/n;->a:LN5/f;

    .line 455
    .line 456
    invoke-static {v2}, LM5/y;->a(Lq5/h;)LR5/d;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    new-instance v4, LZ2/d;

    .line 461
    .line 462
    invoke-direct {v4, v1, v0, v3}, LZ2/d;-><init>(LU4/q;Ljava/lang/String;Lq5/c;)V

    .line 463
    .line 464
    .line 465
    const/4 v0, 0x3

    .line 466
    invoke-static {v2, v3, v3, v4, v0}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;

    .line 467
    .line 468
    .line 469
    :cond_12
    return-object v3

    .line 470
    :goto_f
    monitor-exit v5

    .line 471
    throw v0

    .line 472
    nop

    .line 473
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget v3, v1, LU4/q;->a:I

    .line 8
    .line 9
    packed-switch v3, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const-string v3, "view"

    .line 13
    .line 14
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "request"

    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v3, v1, LU4/q;->b:LR4/k1;

    .line 23
    .line 24
    iget-object v4, v3, LR4/k1;->M:LO3/e0;

    .line 25
    .line 26
    invoke-virtual {v4}, LO3/e0;->b()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_16

    .line 31
    .line 32
    iget-object v4, v1, LU4/q;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v4, Lk5/b;

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object v3, v3, LR4/k1;->d:LR4/i;

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    iget-object v3, v3, LR4/i;->P:Ljava/lang/Boolean;

    .line 44
    .line 45
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-static {v3, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 v3, 0x0

    .line 53
    :goto_0
    if-eqz v3, :cond_2

    .line 54
    .line 55
    :cond_1
    const/4 v5, 0x0

    .line 56
    goto/16 :goto_20

    .line 57
    .line 58
    :cond_2
    iget-object v3, v1, LU4/q;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, LZ/m;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    const-string v6, "blob"

    .line 66
    .line 67
    invoke-interface {v2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-virtual {v7}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    const-string v8, "toString(...)"

    .line 76
    .line 77
    invoke-static {v7, v8}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-virtual {v8}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 89
    .line 90
    .line 91
    move-result-object v9

    .line 92
    invoke-virtual {v9}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    iget-object v10, v3, LZ/m;->r:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v10, LR4/k1;

    .line 99
    .line 100
    iget-object v11, v10, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 101
    .line 102
    iget-object v12, v10, LR4/k1;->k:Landroid/webkit/WebView;

    .line 103
    .line 104
    iget-object v13, v10, LR4/k1;->d:LR4/i;

    .line 105
    .line 106
    iget-object v14, v10, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 107
    .line 108
    iget-object v15, v10, LR4/k1;->M:LO3/e0;

    .line 109
    .line 110
    invoke-virtual {v15}, LO3/e0;->b()Z

    .line 111
    .line 112
    .line 113
    move-result v15

    .line 114
    if-eqz v15, :cond_16

    .line 115
    .line 116
    if-eqz v13, :cond_3

    .line 117
    .line 118
    iget-object v15, v13, LR4/i;->V:LR4/I1;

    .line 119
    .line 120
    if-eqz v15, :cond_3

    .line 121
    .line 122
    iget-object v15, v15, LR4/I1;->a:Ljava/lang/Boolean;

    .line 123
    .line 124
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-static {v15, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    goto :goto_1

    .line 131
    :cond_3
    const/4 v5, 0x0

    .line 132
    :goto_1
    if-nez v5, :cond_5

    .line 133
    .line 134
    invoke-interface {v2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    if-eqz v13, :cond_4

    .line 143
    .line 144
    iget-object v5, v13, LR4/i;->V:LR4/I1;

    .line 145
    .line 146
    if-eqz v5, :cond_4

    .line 147
    .line 148
    iget-object v5, v5, LR4/I1;->b:Ljava/lang/String;

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_4
    const/4 v5, 0x0

    .line 152
    :goto_2
    invoke-static {v2, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-eqz v2, :cond_5

    .line 157
    .line 158
    iget-object v2, v10, LR4/k1;->S:Lg5/h;

    .line 159
    .line 160
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    :cond_5
    if-eqz v13, :cond_6

    .line 164
    .line 165
    iget-object v2, v13, LR4/i;->J:Ljava/util/List;

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_6
    const/4 v2, 0x0

    .line 169
    :goto_3
    if-eqz v2, :cond_8

    .line 170
    .line 171
    if-eqz v13, :cond_7

    .line 172
    .line 173
    iget-object v2, v13, LR4/i;->J:Ljava/util/List;

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_7
    const/4 v2, 0x0

    .line 177
    :goto_4
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    check-cast v2, Ljava/lang/Iterable;

    .line 181
    .line 182
    new-instance v5, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    if-eqz v5, :cond_8

    .line 196
    .line 197
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    check-cast v2, LR4/e3;

    .line 202
    .line 203
    iget-object v5, v2, LR4/e3;->a:Ljava/lang/String;

    .line 204
    .line 205
    invoke-static {v5, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_8

    .line 210
    .line 211
    iget-object v2, v2, LR4/e3;->b:Ljava/lang/String;

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_8
    move-object v2, v7

    .line 215
    :goto_5
    invoke-static {v2, v7}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-nez v5, :cond_a

    .line 220
    .line 221
    if-eqz v2, :cond_a

    .line 222
    .line 223
    if-eqz v12, :cond_9

    .line 224
    .line 225
    invoke-virtual {v12}, Landroid/webkit/WebView;->stopLoading()V

    .line 226
    .line 227
    .line 228
    :cond_9
    if-eqz v12, :cond_16

    .line 229
    .line 230
    invoke-virtual {v12, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    :goto_6
    const/4 v5, 0x1

    .line 234
    goto/16 :goto_20

    .line 235
    .line 236
    :cond_a
    const-string v2, "accounts.google.com"

    .line 237
    .line 238
    invoke-static {v7, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-nez v2, :cond_11

    .line 243
    .line 244
    new-instance v2, Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 247
    .line 248
    .line 249
    if-eqz v13, :cond_b

    .line 250
    .line 251
    iget-object v5, v13, LR4/i;->p:LR4/w1;

    .line 252
    .line 253
    goto :goto_7

    .line 254
    :cond_b
    const/4 v5, 0x0

    .line 255
    :goto_7
    if-eqz v5, :cond_f

    .line 256
    .line 257
    if-eqz v13, :cond_c

    .line 258
    .line 259
    iget-object v5, v13, LR4/i;->p:LR4/w1;

    .line 260
    .line 261
    if-eqz v5, :cond_c

    .line 262
    .line 263
    iget-object v5, v5, LR4/w1;->a:Ljava/util/List;

    .line 264
    .line 265
    goto :goto_8

    .line 266
    :cond_c
    const/4 v5, 0x0

    .line 267
    :goto_8
    if-eqz v5, :cond_f

    .line 268
    .line 269
    if-eqz v13, :cond_d

    .line 270
    .line 271
    iget-object v5, v13, LR4/i;->p:LR4/w1;

    .line 272
    .line 273
    if-eqz v5, :cond_d

    .line 274
    .line 275
    iget-object v5, v5, LR4/w1;->a:Ljava/util/List;

    .line 276
    .line 277
    goto :goto_9

    .line 278
    :cond_d
    const/4 v5, 0x0

    .line 279
    :goto_9
    invoke-static {v5}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    move-object/from16 v16, v5

    .line 283
    .line 284
    check-cast v16, Ljava/util/Collection;

    .line 285
    .line 286
    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->size()I

    .line 287
    .line 288
    .line 289
    move-result v15

    .line 290
    const/4 v4, 0x0

    .line 291
    :goto_a
    if-ge v4, v15, :cond_f

    .line 292
    .line 293
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v17

    .line 297
    move/from16 p2, v4

    .line 298
    .line 299
    move-object/from16 v4, v17

    .line 300
    .line 301
    check-cast v4, LR4/o3;

    .line 302
    .line 303
    iget-object v4, v4, LR4/o3;->a:Ljava/lang/String;

    .line 304
    .line 305
    if-eqz v4, :cond_e

    .line 306
    .line 307
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    :cond_e
    add-int/lit8 v4, p2, 0x1

    .line 311
    .line 312
    goto :goto_a

    .line 313
    :cond_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-nez v4, :cond_10

    .line 318
    .line 319
    invoke-static {v2, v7}, Ly4/b;->x(Ljava/util/ArrayList;Ljava/lang/String;)I

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    const/4 v4, -0x1

    .line 324
    if-eq v2, v4, :cond_10

    .line 325
    .line 326
    const/4 v2, 0x1

    .line 327
    goto :goto_b

    .line 328
    :cond_10
    const/4 v2, 0x0

    .line 329
    :goto_b
    if-eqz v2, :cond_12

    .line 330
    .line 331
    :cond_11
    const/4 v2, 0x1

    .line 332
    const/4 v4, 0x0

    .line 333
    goto/16 :goto_18

    .line 334
    .line 335
    :cond_12
    const-string v2, "upi://"

    .line 336
    .line 337
    const/4 v4, 0x0

    .line 338
    invoke-static {v7, v2, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    const-string v5, "android.intent.action.VIEW"

    .line 343
    .line 344
    if-nez v2, :cond_2a

    .line 345
    .line 346
    const-string v2, "gcash://"

    .line 347
    .line 348
    invoke-static {v7, v2, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    if-eqz v2, :cond_13

    .line 353
    .line 354
    goto/16 :goto_17

    .line 355
    .line 356
    :cond_13
    if-eqz v8, :cond_15

    .line 357
    .line 358
    const-string v2, "appleid.apple.com"

    .line 359
    .line 360
    invoke-static {v8, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    if-nez v2, :cond_14

    .line 365
    .line 366
    const-string v2, "m.facebook.com"

    .line 367
    .line 368
    invoke-static {v8, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    if-eqz v2, :cond_15

    .line 373
    .line 374
    :cond_14
    const/4 v4, 0x0

    .line 375
    goto/16 :goto_1f

    .line 376
    .line 377
    :cond_15
    const-string v2, "sms:"

    .line 378
    .line 379
    const/4 v4, 0x0

    .line 380
    invoke-static {v7, v2, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    if-eqz v2, :cond_17

    .line 385
    .line 386
    :try_start_0
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    new-instance v2, Landroid/content/Intent;

    .line 391
    .line 392
    invoke-direct {v2, v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 393
    .line 394
    .line 395
    const-string v0, "Share"

    .line 396
    .line 397
    invoke-static {v2, v0}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-virtual {v11, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 402
    .line 403
    .line 404
    goto :goto_c

    .line 405
    :catch_0
    move-exception v0

    .line 406
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 407
    .line 408
    .line 409
    :cond_16
    :goto_c
    const/4 v2, 0x1

    .line 410
    goto/16 :goto_1c

    .line 411
    .line 412
    :cond_17
    const-string v2, "tel:"

    .line 413
    .line 414
    const/4 v4, 0x0

    .line 415
    invoke-static {v7, v2, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    if-eqz v2, :cond_18

    .line 420
    .line 421
    new-instance v0, Landroid/content/Intent;

    .line 422
    .line 423
    const-string v2, "android.intent.action.DIAL"

    .line 424
    .line 425
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v11, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 436
    .line 437
    .line 438
    goto :goto_c

    .line 439
    :cond_18
    const-string v2, "mailto:"

    .line 440
    .line 441
    invoke-static {v7, v2, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    if-eqz v2, :cond_19

    .line 446
    .line 447
    :try_start_1
    new-instance v0, Landroid/content/Intent;

    .line 448
    .line 449
    const-string v2, "android.intent.action.SENDTO"

    .line 450
    .line 451
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v11, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 459
    .line 460
    .line 461
    goto :goto_c

    .line 462
    :catch_1
    const-string v0, "No apps available to handle mails"

    .line 463
    .line 464
    const/4 v2, 0x1

    .line 465
    invoke-static {v11, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 470
    .line 471
    .line 472
    goto :goto_c

    .line 473
    :cond_19
    const-string v2, "open-url-in-custom-tab"

    .line 474
    .line 475
    invoke-static {v7, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    if-nez v2, :cond_29

    .line 480
    .line 481
    const-string v2, "loadIn=customTab"

    .line 482
    .line 483
    invoke-static {v7, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 484
    .line 485
    .line 486
    move-result v2

    .line 487
    if-eqz v2, :cond_1a

    .line 488
    .line 489
    goto/16 :goto_16

    .line 490
    .line 491
    :cond_1a
    const-string v2, "open-url-in-browser"

    .line 492
    .line 493
    invoke-static {v7, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 494
    .line 495
    .line 496
    move-result v2

    .line 497
    if-nez v2, :cond_28

    .line 498
    .line 499
    const-string v2, "loadIn=defaultBrowser"

    .line 500
    .line 501
    invoke-static {v7, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 502
    .line 503
    .line 504
    move-result v2

    .line 505
    if-nez v2, :cond_28

    .line 506
    .line 507
    invoke-static {v9}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    const-string v2, "whatsapp"

    .line 511
    .line 512
    invoke-static {v9, v2}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 513
    .line 514
    .line 515
    move-result v2

    .line 516
    if-eqz v2, :cond_1b

    .line 517
    .line 518
    goto/16 :goto_15

    .line 519
    .line 520
    :cond_1b
    const-string v2, "data:image"

    .line 521
    .line 522
    const/4 v4, 0x0

    .line 523
    invoke-static {v7, v2, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 524
    .line 525
    .line 526
    move-result v8

    .line 527
    if-nez v8, :cond_35

    .line 528
    .line 529
    const-string v8, "data:"

    .line 530
    .line 531
    invoke-static {v7, v8, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 532
    .line 533
    .line 534
    move-result v8

    .line 535
    if-eqz v8, :cond_1c

    .line 536
    .line 537
    goto/16 :goto_1f

    .line 538
    .line 539
    :cond_1c
    const-string v8, "intent://"

    .line 540
    .line 541
    invoke-static {v7, v8, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 542
    .line 543
    .line 544
    move-result v8

    .line 545
    if-nez v8, :cond_26

    .line 546
    .line 547
    const-string v8, "rib://"

    .line 548
    .line 549
    invoke-static {v7, v8, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 550
    .line 551
    .line 552
    move-result v8

    .line 553
    if-eqz v8, :cond_1d

    .line 554
    .line 555
    goto/16 :goto_13

    .line 556
    .line 557
    :cond_1d
    const-string v8, "w2n://"

    .line 558
    .line 559
    invoke-static {v7, v8, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 560
    .line 561
    .line 562
    move-result v8

    .line 563
    if-eqz v8, :cond_1e

    .line 564
    .line 565
    invoke-virtual {v3, v7}, LZ/m;->r(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    goto/16 :goto_c

    .line 569
    .line 570
    :cond_1e
    const-string v8, "http"

    .line 571
    .line 572
    invoke-static {v7, v8, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 573
    .line 574
    .line 575
    move-result v8

    .line 576
    if-nez v8, :cond_25

    .line 577
    .line 578
    :try_start_2
    const-string v0, ""
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 579
    .line 580
    :try_start_3
    const-string v8, "://"

    .line 581
    .line 582
    const/4 v9, 0x6

    .line 583
    invoke-static {v7, v8, v4, v9}, LJ5/m;->S0(Ljava/lang/CharSequence;Ljava/lang/String;II)I

    .line 584
    .line 585
    .line 586
    move-result v8

    .line 587
    invoke-virtual {v7, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v8

    .line 591
    const-string v4, "substring(...)"

    .line 592
    .line 593
    invoke-static {v8, v4}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 594
    .line 595
    .line 596
    move-object v0, v8

    .line 597
    :goto_d
    const/4 v4, 0x0

    .line 598
    goto :goto_e

    .line 599
    :catch_2
    :try_start_4
    const-string v4, "Failed to get urlSchemeProtocol"

    .line 600
    .line 601
    sget-object v8, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 602
    .line 603
    invoke-virtual {v8, v4}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 604
    .line 605
    .line 606
    goto :goto_d

    .line 607
    :goto_e
    invoke-static {v7, v2, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    if-nez v2, :cond_16

    .line 612
    .line 613
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 614
    .line 615
    .line 616
    move-result v2

    .line 617
    if-lez v2, :cond_1f

    .line 618
    .line 619
    const/4 v2, 0x1

    .line 620
    goto :goto_f

    .line 621
    :cond_1f
    const/4 v2, 0x0

    .line 622
    :goto_f
    if-eqz v2, :cond_21

    .line 623
    .line 624
    if-eqz v12, :cond_20

    .line 625
    .line 626
    invoke-virtual {v12}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v15

    .line 630
    goto :goto_10

    .line 631
    :catch_3
    move-exception v0

    .line 632
    goto :goto_11

    .line 633
    :cond_20
    const/4 v15, 0x0

    .line 634
    :goto_10
    invoke-static {v15}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 635
    .line 636
    .line 637
    invoke-static {v15, v0}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 638
    .line 639
    .line 640
    move-result v0

    .line 641
    if-eqz v0, :cond_21

    .line 642
    .line 643
    goto/16 :goto_c

    .line 644
    .line 645
    :cond_21
    const-string v0, "about:blank#blocked"

    .line 646
    .line 647
    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 648
    .line 649
    .line 650
    move-result v0

    .line 651
    if-nez v0, :cond_16

    .line 652
    .line 653
    const/4 v4, 0x0

    .line 654
    invoke-static {v7, v6, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 655
    .line 656
    .line 657
    move-result v0

    .line 658
    if-nez v0, :cond_1

    .line 659
    .line 660
    new-instance v0, Landroid/content/Intent;

    .line 661
    .line 662
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    invoke-direct {v0, v5, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v11, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 670
    .line 671
    .line 672
    goto/16 :goto_c

    .line 673
    .line 674
    :goto_11
    const-string v2, "truecallersdk"

    .line 675
    .line 676
    const/4 v4, 0x0

    .line 677
    invoke-static {v7, v2, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 678
    .line 679
    .line 680
    move-result v2

    .line 681
    if-eqz v2, :cond_22

    .line 682
    .line 683
    const-string v2, "Truecaller app not installed"

    .line 684
    .line 685
    const/4 v5, 0x1

    .line 686
    invoke-static {v11, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 691
    .line 692
    .line 693
    goto :goto_12

    .line 694
    :cond_22
    const/4 v5, 0x1

    .line 695
    invoke-static {v7, v6, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 696
    .line 697
    .line 698
    move-result v2

    .line 699
    if-eqz v2, :cond_23

    .line 700
    .line 701
    invoke-static {v7, v6, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 702
    .line 703
    .line 704
    move-result v2

    .line 705
    if-eqz v2, :cond_24

    .line 706
    .line 707
    invoke-virtual {v3, v7}, LZ/m;->r(Ljava/lang/String;)V

    .line 708
    .line 709
    .line 710
    goto :goto_12

    .line 711
    :cond_23
    const-string v2, "App failed to load the url"

    .line 712
    .line 713
    invoke-static {v11, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 714
    .line 715
    .line 716
    move-result-object v2

    .line 717
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 718
    .line 719
    .line 720
    :cond_24
    :goto_12
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 721
    .line 722
    .line 723
    goto/16 :goto_c

    .line 724
    .line 725
    :cond_25
    iget-object v2, v3, LZ/m;->s:Ljava/lang/Object;

    .line 726
    .line 727
    check-cast v2, LK2/a;

    .line 728
    .line 729
    invoke-virtual {v2, v0, v7}, LK2/a;->d(Landroid/webkit/WebView;Ljava/lang/String;)Z

    .line 730
    .line 731
    .line 732
    move-result v5

    .line 733
    goto/16 :goto_20

    .line 734
    .line 735
    :cond_26
    :goto_13
    :try_start_5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    const-string v3, "getContext(...)"

    .line 740
    .line 741
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    const/4 v3, 0x1

    .line 745
    invoke-static {v7, v3}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    .line 746
    .line 747
    .line 748
    move-result-object v4

    .line 749
    if-eqz v4, :cond_16

    .line 750
    .line 751
    invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V
    :try_end_5
    .catch Ljava/net/URISyntaxException; {:try_start_5 .. :try_end_5} :catch_4

    .line 752
    .line 753
    .line 754
    :try_start_6
    invoke-virtual {v2, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_6
    .catch Landroid/content/ActivityNotFoundException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/net/URISyntaxException; {:try_start_6 .. :try_end_6} :catch_4

    .line 755
    .line 756
    .line 757
    goto/16 :goto_6

    .line 758
    .line 759
    :catch_4
    move-exception v0

    .line 760
    goto :goto_14

    .line 761
    :catch_5
    :try_start_7
    const-string v0, "browser_fallback_url"

    .line 762
    .line 763
    invoke-virtual {v4, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v0

    .line 767
    if-eqz v0, :cond_27

    .line 768
    .line 769
    new-instance v3, Landroid/content/Intent;

    .line 770
    .line 771
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-direct {v3, v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 779
    .line 780
    .line 781
    goto/16 :goto_6

    .line 782
    .line 783
    :cond_27
    const-string v0, "Issue in opening the app/link"

    .line 784
    .line 785
    const/4 v4, 0x0

    .line 786
    invoke-static {v11, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_7
    .catch Ljava/net/URISyntaxException; {:try_start_7 .. :try_end_7} :catch_4

    .line 791
    .line 792
    .line 793
    goto/16 :goto_6

    .line 794
    .line 795
    :goto_14
    const-string v2, "MainActivity"

    .line 796
    .line 797
    const-string v3, "Can\'t resolve intent://"

    .line 798
    .line 799
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 800
    .line 801
    .line 802
    goto/16 :goto_c

    .line 803
    .line 804
    :cond_28
    :goto_15
    :try_start_8
    new-instance v0, Landroid/content/Intent;

    .line 805
    .line 806
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    invoke-direct {v0, v5, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 811
    .line 812
    .line 813
    invoke-virtual {v11, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    .line 814
    .line 815
    .line 816
    goto/16 :goto_c

    .line 817
    .line 818
    :catch_6
    const-string v0, "No apps available to handle the request"

    .line 819
    .line 820
    const/4 v2, 0x1

    .line 821
    invoke-static {v11, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 826
    .line 827
    .line 828
    goto/16 :goto_c

    .line 829
    .line 830
    :cond_29
    :goto_16
    const-string v0, "#ffffff"

    .line 831
    .line 832
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 833
    .line 834
    .line 835
    move-result v0

    .line 836
    const/high16 v2, -0x1000000

    .line 837
    .line 838
    or-int/2addr v0, v2

    .line 839
    new-instance v2, LL/s;

    .line 840
    .line 841
    invoke-direct {v2}, LL/s;-><init>()V

    .line 842
    .line 843
    .line 844
    new-instance v3, Landroid/os/Bundle;

    .line 845
    .line 846
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 847
    .line 848
    .line 849
    const-string v4, "android.support.customtabs.extra.TOOLBAR_COLOR"

    .line 850
    .line 851
    invoke-virtual {v3, v4, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 852
    .line 853
    .line 854
    iput-object v3, v2, LL/s;->e:Ljava/lang/Object;

    .line 855
    .line 856
    invoke-virtual {v2}, LL/s;->b()LZ/m;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 861
    .line 862
    .line 863
    move-result-object v2

    .line 864
    iget-object v3, v0, LZ/m;->r:Ljava/lang/Object;

    .line 865
    .line 866
    check-cast v3, Landroid/content/Intent;

    .line 867
    .line 868
    const-string v4, "com.android.chrome"

    .line 869
    .line 870
    :try_start_9
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 871
    .line 872
    .line 873
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v3, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 877
    .line 878
    .line 879
    iget-object v0, v0, LZ/m;->s:Ljava/lang/Object;

    .line 880
    .line 881
    check-cast v0, Landroid/os/Bundle;

    .line 882
    .line 883
    invoke-virtual {v14, v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_7

    .line 884
    .line 885
    .line 886
    goto/16 :goto_c

    .line 887
    .line 888
    :catch_7
    new-instance v0, Landroid/content/Intent;

    .line 889
    .line 890
    invoke-direct {v0, v5, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v14, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 894
    .line 895
    .line 896
    goto/16 :goto_c

    .line 897
    .line 898
    :cond_2a
    :goto_17
    :try_start_a
    new-instance v0, Landroid/content/Intent;

    .line 899
    .line 900
    invoke-direct {v0, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 901
    .line 902
    .line 903
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 908
    .line 909
    .line 910
    invoke-virtual {v11, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_8

    .line 911
    .line 912
    .line 913
    goto/16 :goto_c

    .line 914
    .line 915
    :catch_8
    const-string v0, "No upi app available on device."

    .line 916
    .line 917
    const/4 v2, 0x1

    .line 918
    invoke-static {v11, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 923
    .line 924
    .line 925
    goto :goto_1c

    .line 926
    :goto_18
    if-eqz v13, :cond_2b

    .line 927
    .line 928
    iget-object v0, v13, LR4/i;->N:LR4/P0;

    .line 929
    .line 930
    if-eqz v0, :cond_2b

    .line 931
    .line 932
    iget-object v0, v0, LR4/P0;->d:Ljava/lang/Boolean;

    .line 933
    .line 934
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 935
    .line 936
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 937
    .line 938
    .line 939
    move-result v0

    .line 940
    goto :goto_19

    .line 941
    :cond_2b
    move v0, v4

    .line 942
    :goto_19
    const-string v3, "googleGsiLoginScreen"

    .line 943
    .line 944
    const-string v5, "gis_transform"

    .line 945
    .line 946
    if-eqz v0, :cond_32

    .line 947
    .line 948
    if-eqz v13, :cond_2c

    .line 949
    .line 950
    iget-object v0, v13, LR4/i;->N:LR4/P0;

    .line 951
    .line 952
    if-eqz v0, :cond_2c

    .line 953
    .line 954
    iget-object v0, v0, LR4/P0;->b:Ljava/lang/String;

    .line 955
    .line 956
    goto :goto_1a

    .line 957
    :cond_2c
    const/4 v0, 0x0

    .line 958
    :goto_1a
    if-nez v0, :cond_2d

    .line 959
    .line 960
    goto :goto_1d

    .line 961
    :cond_2d
    const-string v0, "redirect_uri"

    .line 962
    .line 963
    invoke-static {v7, v0}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 964
    .line 965
    .line 966
    move-result v4

    .line 967
    if-eqz v4, :cond_2f

    .line 968
    .line 969
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 970
    .line 971
    .line 972
    move-result-object v4

    .line 973
    invoke-virtual {v4, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object v0

    .line 977
    iput-object v0, v10, LR4/k1;->n0:Ljava/lang/String;

    .line 978
    .line 979
    const-string v0, "state"

    .line 980
    .line 981
    invoke-virtual {v4, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    iget-object v0, v10, LR4/k1;->n0:Ljava/lang/String;

    .line 985
    .line 986
    invoke-static {v0, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    move-result v0

    .line 990
    if-eqz v0, :cond_30

    .line 991
    .line 992
    if-eqz v13, :cond_2e

    .line 993
    .line 994
    iget-object v0, v13, LR4/i;->N:LR4/P0;

    .line 995
    .line 996
    if-eqz v0, :cond_2e

    .line 997
    .line 998
    iget-object v15, v0, LR4/P0;->e:Ljava/lang/String;

    .line 999
    .line 1000
    goto :goto_1b

    .line 1001
    :cond_2e
    const/4 v15, 0x0

    .line 1002
    :goto_1b
    const-string v0, "POPUP_FLOW"

    .line 1003
    .line 1004
    invoke-static {v15, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1005
    .line 1006
    .line 1007
    move-result v0

    .line 1008
    if-eqz v0, :cond_30

    .line 1009
    .line 1010
    iput-object v7, v10, LR4/k1;->A:Ljava/lang/String;

    .line 1011
    .line 1012
    iget-object v0, v10, LR4/k1;->e:LT1/u;

    .line 1013
    .line 1014
    if-eqz v0, :cond_2f

    .line 1015
    .line 1016
    invoke-static {v0, v3}, LT1/u;->b(LT1/u;Ljava/lang/String;)V

    .line 1017
    .line 1018
    .line 1019
    :cond_2f
    :goto_1c
    move v5, v2

    .line 1020
    goto :goto_20

    .line 1021
    :cond_30
    sget-object v0, LR4/V;->d:LR4/V;

    .line 1022
    .line 1023
    if-nez v0, :cond_31

    .line 1024
    .line 1025
    new-instance v0, LR4/V;

    .line 1026
    .line 1027
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1028
    .line 1029
    .line 1030
    sput-object v0, LR4/V;->d:LR4/V;

    .line 1031
    .line 1032
    :cond_31
    sget-object v0, LR4/V;->d:LR4/V;

    .line 1033
    .line 1034
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 1035
    .line 1036
    .line 1037
    goto :goto_1c

    .line 1038
    :cond_32
    :goto_1d
    invoke-static {v7, v5}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1039
    .line 1040
    .line 1041
    move-result v0

    .line 1042
    if-eqz v0, :cond_33

    .line 1043
    .line 1044
    iput-object v7, v10, LR4/k1;->A:Ljava/lang/String;

    .line 1045
    .line 1046
    iget-object v0, v10, LR4/k1;->e:LT1/u;

    .line 1047
    .line 1048
    if-eqz v0, :cond_2f

    .line 1049
    .line 1050
    invoke-static {v0, v3}, LT1/u;->b(LT1/u;Ljava/lang/String;)V

    .line 1051
    .line 1052
    .line 1053
    goto :goto_1c

    .line 1054
    :cond_33
    if-eqz v13, :cond_34

    .line 1055
    .line 1056
    iget-object v0, v13, LR4/i;->D:Ljava/lang/Boolean;

    .line 1057
    .line 1058
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1059
    .line 1060
    invoke-static {v0, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1061
    .line 1062
    .line 1063
    move-result v0

    .line 1064
    goto :goto_1e

    .line 1065
    :cond_34
    move v0, v4

    .line 1066
    :goto_1e
    if-nez v0, :cond_35

    .line 1067
    .line 1068
    iput-object v7, v10, LR4/k1;->A:Ljava/lang/String;

    .line 1069
    .line 1070
    iget-object v0, v10, LR4/k1;->e:LT1/u;

    .line 1071
    .line 1072
    if-eqz v0, :cond_2f

    .line 1073
    .line 1074
    const-string v3, "externalUrlsForLogin"

    .line 1075
    .line 1076
    invoke-static {v0, v3}, LT1/u;->b(LT1/u;Ljava/lang/String;)V

    .line 1077
    .line 1078
    .line 1079
    goto :goto_1c

    .line 1080
    :cond_35
    :goto_1f
    move v5, v4

    .line 1081
    :goto_20
    return v5

    .line 1082
    :pswitch_0
    const/4 v0, 0x0

    .line 1083
    if-eqz v2, :cond_36

    .line 1084
    .line 1085
    invoke-interface {v2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v2

    .line 1089
    goto :goto_21

    .line 1090
    :cond_36
    move-object v2, v0

    .line 1091
    :goto_21
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v2

    .line 1095
    const-string v3, "accounts.google.com"

    .line 1096
    .line 1097
    invoke-static {v2, v3}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1098
    .line 1099
    .line 1100
    move-result v3

    .line 1101
    const/4 v4, 0x0

    .line 1102
    if-eqz v3, :cond_3b

    .line 1103
    .line 1104
    iget-object v3, v1, LU4/q;->b:LR4/k1;

    .line 1105
    .line 1106
    iget-object v5, v3, LR4/k1;->d:LR4/i;

    .line 1107
    .line 1108
    if-eqz v5, :cond_37

    .line 1109
    .line 1110
    iget-object v5, v5, LR4/i;->N:LR4/P0;

    .line 1111
    .line 1112
    if-eqz v5, :cond_37

    .line 1113
    .line 1114
    iget-object v5, v5, LR4/P0;->d:Ljava/lang/Boolean;

    .line 1115
    .line 1116
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1117
    .line 1118
    invoke-static {v5, v6}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1119
    .line 1120
    .line 1121
    move-result v5

    .line 1122
    goto :goto_22

    .line 1123
    :cond_37
    move v5, v4

    .line 1124
    :goto_22
    if-eqz v5, :cond_3b

    .line 1125
    .line 1126
    iget-object v5, v3, LR4/k1;->d:LR4/i;

    .line 1127
    .line 1128
    if-eqz v5, :cond_38

    .line 1129
    .line 1130
    iget-object v5, v5, LR4/i;->N:LR4/P0;

    .line 1131
    .line 1132
    if-eqz v5, :cond_38

    .line 1133
    .line 1134
    iget-object v0, v5, LR4/P0;->b:Ljava/lang/String;

    .line 1135
    .line 1136
    :cond_38
    if-nez v0, :cond_39

    .line 1137
    .line 1138
    goto :goto_23

    .line 1139
    :cond_39
    const-string v0, "redirect_uri"

    .line 1140
    .line 1141
    invoke-static {v2, v0}, LJ5/m;->K0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 1142
    .line 1143
    .line 1144
    move-result v5

    .line 1145
    if-eqz v5, :cond_3b

    .line 1146
    .line 1147
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v2

    .line 1151
    invoke-virtual {v2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v0

    .line 1155
    iput-object v0, v3, LR4/k1;->n0:Ljava/lang/String;

    .line 1156
    .line 1157
    const-string v0, "state"

    .line 1158
    .line 1159
    invoke-virtual {v2, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 1160
    .line 1161
    .line 1162
    sget-object v0, LR4/V;->d:LR4/V;

    .line 1163
    .line 1164
    if-nez v0, :cond_3a

    .line 1165
    .line 1166
    new-instance v0, LR4/V;

    .line 1167
    .line 1168
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1169
    .line 1170
    .line 1171
    sput-object v0, LR4/V;->d:LR4/V;

    .line 1172
    .line 1173
    :cond_3a
    sget-object v0, LR4/V;->d:LR4/V;

    .line 1174
    .line 1175
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 1176
    .line 1177
    .line 1178
    const/4 v4, 0x1

    .line 1179
    :cond_3b
    :goto_23
    return v4

    .line 1180
    :pswitch_1
    iget-object v3, v1, LU4/q;->c:Ljava/lang/Object;

    .line 1181
    .line 1182
    check-cast v3, Landroid/content/Context;

    .line 1183
    .line 1184
    const-string v4, "view"

    .line 1185
    .line 1186
    invoke-static {v0, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1187
    .line 1188
    .line 1189
    const-string v0, "request"

    .line 1190
    .line 1191
    invoke-static {v2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1192
    .line 1193
    .line 1194
    invoke-interface {v2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v0

    .line 1198
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v2

    .line 1202
    const-string v0, "toString(...)"

    .line 1203
    .line 1204
    invoke-static {v2, v0}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1205
    .line 1206
    .line 1207
    const-string v0, "mailto:"

    .line 1208
    .line 1209
    const/4 v4, 0x0

    .line 1210
    invoke-static {v2, v0, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1211
    .line 1212
    .line 1213
    move-result v0

    .line 1214
    const/4 v5, 0x1

    .line 1215
    if-eqz v0, :cond_3d

    .line 1216
    .line 1217
    :try_start_b
    new-instance v0, Landroid/content/Intent;

    .line 1218
    .line 1219
    const-string v6, "android.intent.action.SENDTO"

    .line 1220
    .line 1221
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v2

    .line 1225
    invoke-direct {v0, v6, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_9

    .line 1229
    .line 1230
    .line 1231
    :cond_3c
    :goto_24
    move v4, v5

    .line 1232
    goto :goto_26

    .line 1233
    :catch_9
    move-exception v0

    .line 1234
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1235
    .line 1236
    .line 1237
    goto :goto_26

    .line 1238
    :cond_3d
    const-string v0, "http"

    .line 1239
    .line 1240
    invoke-static {v2, v0, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1241
    .line 1242
    .line 1243
    move-result v0

    .line 1244
    if-nez v0, :cond_41

    .line 1245
    .line 1246
    :try_start_c
    const-string v0, "about:blank#blocked"

    .line 1247
    .line 1248
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1249
    .line 1250
    .line 1251
    move-result v0

    .line 1252
    if-nez v0, :cond_3c

    .line 1253
    .line 1254
    new-instance v0, Landroid/content/Intent;

    .line 1255
    .line 1256
    const-string v6, "android.intent.action.VIEW"

    .line 1257
    .line 1258
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v7

    .line 1262
    invoke-direct {v0, v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_a

    .line 1266
    .line 1267
    .line 1268
    goto :goto_24

    .line 1269
    :catch_a
    move-exception v0

    .line 1270
    const-string v3, "truecallersdk"

    .line 1271
    .line 1272
    invoke-static {v2, v3, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v3

    .line 1276
    iget-object v6, v1, LU4/q;->b:LR4/k1;

    .line 1277
    .line 1278
    if-eqz v3, :cond_3e

    .line 1279
    .line 1280
    iget-object v2, v6, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 1281
    .line 1282
    const-string v3, "Truecaller app not installed"

    .line 1283
    .line 1284
    invoke-static {v2, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v2

    .line 1288
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 1289
    .line 1290
    .line 1291
    goto :goto_25

    .line 1292
    :cond_3e
    const-string v3, "blob"

    .line 1293
    .line 1294
    invoke-static {v2, v3, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1295
    .line 1296
    .line 1297
    move-result v7

    .line 1298
    if-eqz v7, :cond_3f

    .line 1299
    .line 1300
    invoke-static {v2, v3, v4}, LJ5/t;->G0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1301
    .line 1302
    .line 1303
    move-result v3

    .line 1304
    if-eqz v3, :cond_40

    .line 1305
    .line 1306
    iget-object v3, v1, LU4/q;->d:Ljava/lang/Object;

    .line 1307
    .line 1308
    check-cast v3, LP/W;

    .line 1309
    .line 1310
    invoke-interface {v3}, LP/S0;->getValue()Ljava/lang/Object;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v3

    .line 1314
    check-cast v3, Landroid/webkit/WebView;

    .line 1315
    .line 1316
    if-eqz v3, :cond_40

    .line 1317
    .line 1318
    invoke-virtual {v3, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 1319
    .line 1320
    .line 1321
    goto :goto_25

    .line 1322
    :cond_3f
    iget-object v2, v6, LR4/k1;->c:Lcom/web2native/MainActivity;

    .line 1323
    .line 1324
    const-string v3, "App failed to load the url"

    .line 1325
    .line 1326
    invoke-static {v2, v3, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 1327
    .line 1328
    .line 1329
    move-result-object v2

    .line 1330
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 1331
    .line 1332
    .line 1333
    :cond_40
    :goto_25
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1334
    .line 1335
    .line 1336
    goto :goto_24

    .line 1337
    :cond_41
    :goto_26
    return v4

    .line 1338
    nop

    .line 1339
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
