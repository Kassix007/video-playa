.class public final LR4/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/web2native/MainActivity;

.field public final b:Landroid/webkit/WebView;

.field public c:Z


# direct methods
.method public constructor <init>(Lcom/web2native/MainActivity;Landroid/webkit/WebView;)V
    .locals 1

    .line 1
    const-string v0, "webView"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LR4/k;->a:Lcom/web2native/MainActivity;

    .line 10
    .line 11
    iput-object p2, p0, LR4/k;->b:Landroid/webkit/WebView;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(LR4/k1;)V
    .locals 5

    .line 1
    iget-object v0, p1, LR4/k1;->e:LT1/u;

    .line 2
    .line 3
    iget-object v1, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 4
    .line 5
    iget-object v2, p1, LR4/k1;->M:LO3/e0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, LT1/u;->b:LW1/j;

    .line 11
    .line 12
    invoke-virtual {v0}, LW1/j;->f()LT1/p;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, v0, LT1/p;->r:LW1/l;

    .line 19
    .line 20
    iget-object v0, v0, LW1/l;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v0, v3

    .line 26
    :goto_0
    const-string v4, "noInternetScreen"

    .line 27
    .line 28
    invoke-static {v0, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v2}, LO3/e0;->a()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iget-object p1, p1, LR4/k1;->e:LT1/u;

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget-object p1, p1, LT1/u;->b:LW1/j;

    .line 43
    .line 44
    invoke-virtual {p1}, LW1/j;->f()LT1/p;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    iget-object p1, p1, LT1/p;->r:LW1/l;

    .line 51
    .line 52
    iget-object p1, p1, LW1/l;->e:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v3, p1

    .line 55
    check-cast v3, Ljava/lang/String;

    .line 56
    .line 57
    :cond_2
    const-string p1, "notificationScreen"

    .line 58
    .line 59
    invoke-static {v3, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    invoke-virtual {v2}, LO3/e0;->a()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    iget-object p1, p0, LR4/k;->b:Landroid/webkit/WebView;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_5

    .line 79
    .line 80
    invoke-virtual {p0}, LR4/k;->c()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/webkit/WebView;->canGoBack()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-virtual {p1}, Landroid/webkit/WebView;->goBack()V

    .line 90
    .line 91
    .line 92
    :cond_4
    return-void

    .line 93
    :cond_5
    iget-boolean p1, p0, LR4/k;->c:Z

    .line 94
    .line 95
    if-eqz p1, :cond_6

    .line 96
    .line 97
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Landroid/app/Activity;->finishAndRemoveTask()V

    .line 101
    .line 102
    .line 103
    :cond_6
    iget-boolean p1, p0, LR4/k;->c:Z

    .line 104
    .line 105
    if-nez p1, :cond_7

    .line 106
    .line 107
    const-string p1, "Press again to exit"

    .line 108
    .line 109
    const/4 v0, 0x0

    .line 110
    iget-object v1, p0, LR4/k;->a:Lcom/web2native/MainActivity;

    .line 111
    .line 112
    invoke-static {v1, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 117
    .line 118
    .line 119
    :cond_7
    const/4 p1, 0x1

    .line 120
    iput-boolean p1, p0, LR4/k;->c:Z

    .line 121
    .line 122
    new-instance p1, Landroid/os/Handler;

    .line 123
    .line 124
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 129
    .line 130
    .line 131
    new-instance v0, LC0/m;

    .line 132
    .line 133
    const/4 v1, 0x4

    .line 134
    invoke-direct {v0, v1, p0}, LC0/m;-><init>(ILjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    const-wide/16 v1, 0x7d0

    .line 138
    .line 139
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final b(LR4/k1;)V
    .locals 7

    .line 1
    const-string v0, "dataObject"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 7
    .line 8
    iget-object v1, p1, LR4/k1;->d:LR4/i;

    .line 9
    .line 10
    iget-object v2, p1, LR4/k1;->p:Ljava/lang/Boolean;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v2, v1, LR4/i;->I:LR4/f0;

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    iget-object v2, v2, LR4/f0;->a:Ljava/lang/Boolean;

    .line 29
    .line 30
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v2, 0x0

    .line 38
    :goto_0
    iget-object v3, p1, LR4/k1;->p:Ljava/lang/Boolean;

    .line 39
    .line 40
    iget-object v4, p0, LR4/k;->b:Landroid/webkit/WebView;

    .line 41
    .line 42
    invoke-virtual {v4}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const/4 v5, 0x0

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    iget-object v1, v1, LR4/i;->I:LR4/f0;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    iget-object v1, v1, LR4/f0;->b:Ljava/lang/String;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move-object v1, v5

    .line 61
    :goto_1
    if-eqz v2, :cond_a

    .line 62
    .line 63
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    invoke-static {v3, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    const-string v6, "window.customBackHandling()"

    .line 70
    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    invoke-virtual {v0, v6, v5}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-static {v3, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    invoke-virtual {p0, p1}, LR4/k;->a(LR4/k1;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_4
    if-nez v3, :cond_9

    .line 92
    .line 93
    if-eqz v1, :cond_8

    .line 94
    .line 95
    invoke-static {v1}, LJ5/m;->U0(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_5

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_5
    const-string v2, "pattern"

    .line 103
    .line 104
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const-string v2, "compile(...)"

    .line 112
    .line 113
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-eqz v1, :cond_7

    .line 125
    .line 126
    if-eqz v0, :cond_6

    .line 127
    .line 128
    invoke-virtual {v0, v6, v5}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 129
    .line 130
    .line 131
    :cond_6
    return-void

    .line 132
    :cond_7
    invoke-virtual {p0, p1}, LR4/k;->a(LR4/k1;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_8
    :goto_2
    invoke-virtual {p0, p1}, LR4/k;->a(LR4/k1;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_9
    new-instance p1, LC2/e;

    .line 141
    .line 142
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 143
    .line 144
    .line 145
    throw p1

    .line 146
    :cond_a
    invoke-virtual {p0, p1}, LR4/k;->a(LR4/k1;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public final c()V
    .locals 8

    .line 1
    iget-object v0, p0, LR4/k;->b:Landroid/webkit/WebView;

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {v0}, Landroid/webkit/WebView;->copyBackForwardList()Landroid/webkit/WebBackForwardList;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "copyBackForwardList(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/webkit/WebBackForwardList;->getCurrentIndex()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-lez v2, :cond_1

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    :goto_0
    invoke-virtual {v1}, Landroid/webkit/WebBackForwardList;->getSize()I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-ge v4, v5, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    invoke-virtual {v5}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    add-int/lit8 v6, v4, 0x1

    .line 35
    .line 36
    sub-int v7, v2, v6

    .line 37
    .line 38
    invoke-virtual {v1, v7}, Landroid/webkit/WebBackForwardList;->getItemAtIndex(I)Landroid/webkit/WebHistoryItem;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-virtual {v7}, Landroid/webkit/WebHistoryItem;->getUrl()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    if-eqz v5, :cond_0

    .line 47
    .line 48
    if-eqz v7, :cond_0

    .line 49
    .line 50
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_0

    .line 55
    .line 56
    move v4, v6

    .line 57
    goto :goto_0

    .line 58
    :catch_0
    move-exception v0

    .line 59
    goto :goto_2

    .line 60
    :cond_0
    if-eqz v4, :cond_1

    .line 61
    .line 62
    :goto_1
    if-ge v3, v4, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    return-void

    .line 71
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 72
    .line 73
    .line 74
    return-void
.end method
