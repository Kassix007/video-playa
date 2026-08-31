.class public final Le5/f;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:LP/W;


# direct methods
.method public constructor <init>(LR4/k1;LP/W;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le5/f;->q:LR4/k1;

    .line 2
    .line 3
    iput-object p2, p0, Le5/f;->r:LP/W;

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
    .locals 2

    .line 1
    new-instance p1, Le5/f;

    .line 2
    .line 3
    iget-object v0, p0, Le5/f;->q:LR4/k1;

    .line 4
    .line 5
    iget-object v1, p0, Le5/f;->r:LP/W;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Le5/f;-><init>(LR4/k1;LP/W;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
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
    invoke-virtual {p0, p1, p2}, Le5/f;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Le5/f;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Le5/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Le5/f;->q:LR4/k1;

    .line 2
    .line 3
    iget-object v1, p0, Le5/f;->r:LP/W;

    .line 4
    .line 5
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :try_start_0
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/lang/String;

    .line 22
    .line 23
    const-string v3, ""

    .line 24
    .line 25
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    iget-object v2, v0, LR4/k1;->d:LR4/i;

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    iget-object v2, v2, LR4/i;->E:Ljava/lang/Boolean;

    .line 36
    .line 37
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception v2

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    move v2, p1

    .line 47
    :goto_0
    const/4 v3, 0x0

    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    .line 52
    const/16 v4, 0x1e

    .line 53
    .line 54
    if-lt v2, v4, :cond_1

    .line 55
    .line 56
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-object v4, v0, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 67
    .line 68
    const/16 v5, 0x9

    .line 69
    .line 70
    invoke-static {v3, v2, v4, v5}, Lcom/google/android/gms/internal/measurement/P1;->Y(Ljava/lang/String;Ljava/lang/String;Lh/h;I)V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_1
    iget-object v2, v0, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 75
    .line 76
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    check-cast v4, Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-static {v2, v4, v3, p1}, Lcom/google/android/gms/internal/measurement/P1;->Z(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_2
    invoke-interface {v1}, LP/S0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Ljava/lang/String;

    .line 98
    .line 99
    if-eqz v2, :cond_3

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-nez v2, :cond_4

    .line 106
    .line 107
    :cond_3
    const/4 p1, 0x1

    .line 108
    :cond_4
    if-nez p1, :cond_5

    .line 109
    .line 110
    iget-object p1, v0, LR4/k1;->s:Lj5/c;

    .line 111
    .line 112
    if-eqz p1, :cond_5

    .line 113
    .line 114
    iget-object p1, p1, Lj5/c;->g:Landroidx/lifecycle/J;

    .line 115
    .line 116
    if-eqz p1, :cond_5

    .line 117
    .line 118
    iget-object v2, v0, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 119
    .line 120
    new-instance v3, LU4/f;

    .line 121
    .line 122
    const/4 v4, 0x2

    .line 123
    invoke-direct {v3, v0, v1, v4}, LU4/f;-><init>(LR4/k1;LP/W;I)V

    .line 124
    .line 125
    .line 126
    new-instance v0, LR4/J0;

    .line 127
    .line 128
    const/4 v1, 0x6

    .line 129
    invoke-direct {v0, v3, v1}, LR4/J0;-><init>(LB5/c;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v2, v0}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 133
    .line 134
    .line 135
    :cond_5
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 136
    .line 137
    return-object p1
.end method
