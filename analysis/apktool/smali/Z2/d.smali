.class public final LZ2/d;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:LU4/q;

.field public final synthetic s:Ljava/lang/String;


# direct methods
.method public constructor <init>(LU4/q;Ljava/lang/String;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZ2/d;->r:LU4/q;

    .line 2
    .line 3
    iput-object p2, p0, LZ2/d;->s:Ljava/lang/String;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance v0, LZ2/d;

    .line 2
    .line 3
    iget-object v1, p0, LZ2/d;->r:LU4/q;

    .line 4
    .line 5
    iget-object v2, p0, LZ2/d;->s:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LZ2/d;-><init>(LU4/q;Ljava/lang/String;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LZ2/d;->q:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LM5/w;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LZ2/d;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LZ2/d;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LZ2/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, LZ2/d;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LM5/w;

    .line 4
    .line 5
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LZ2/d;->r:LU4/q;

    .line 9
    .line 10
    iget-object p1, p1, LU4/q;->b:LR4/k1;

    .line 11
    .line 12
    iget-object v1, p1, LR4/k1;->e:LT1/u;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, LT1/u;->a()LT1/d;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    iget-object v1, v1, LT1/d;->r:LT1/p;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object v1, v1, LT1/p;->r:LW1/l;

    .line 28
    .line 29
    iget-object v1, v1, LW1/l;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Ljava/lang/String;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v1, v2

    .line 35
    :goto_0
    const-string v3, "splashScreen"

    .line 36
    .line 37
    invoke-static {v1, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_5

    .line 42
    .line 43
    iget-object v1, p0, LZ2/d;->s:Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v1, :cond_5

    .line 46
    .line 47
    iget-object v3, p1, LR4/k1;->d:LR4/i;

    .line 48
    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    iget-object v3, v3, LR4/i;->N:LR4/P0;

    .line 52
    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    iget-object v3, v3, LR4/P0;->f:Ljava/lang/String;

    .line 56
    .line 57
    if-nez v3, :cond_2

    .line 58
    .line 59
    :cond_1
    const-string v3, "handleCredentialResponse"

    .line 60
    .line 61
    :cond_2
    iget-object v4, p1, LR4/k1;->k:Landroid/webkit/WebView;

    .line 62
    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    new-instance v5, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v6, "window."

    .line 68
    .line 69
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v3, "({credential:\'"

    .line 76
    .line 77
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, "\'})"

    .line 84
    .line 85
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v4, v1, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Landroid/webkit/CookieManager;->flush()V

    .line 100
    .line 101
    .line 102
    iget-object p1, p1, LR4/k1;->e:LT1/u;

    .line 103
    .line 104
    if-eqz p1, :cond_4

    .line 105
    .line 106
    invoke-virtual {p1}, LT1/u;->c()V

    .line 107
    .line 108
    .line 109
    :cond_4
    invoke-static {v0, v2}, LM5/y;->e(LM5/w;Ljava/util/concurrent/CancellationException;)V

    .line 110
    .line 111
    .line 112
    :cond_5
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 113
    .line 114
    return-object p1
.end method
