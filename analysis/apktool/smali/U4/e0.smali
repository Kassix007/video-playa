.class public final LU4/e0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/k1;


# direct methods
.method public constructor <init>(LR4/k1;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU4/e0;->q:LR4/k1;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 1

    .line 1
    new-instance p1, LU4/e0;

    .line 2
    .line 3
    iget-object v0, p0, LU4/e0;->q:LR4/k1;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LU4/e0;-><init>(LR4/k1;Lq5/c;)V

    .line 6
    .line 7
    .line 8
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
    invoke-virtual {p0, p1, p2}, LU4/e0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LU4/e0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LU4/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LU4/e0;->q:LR4/k1;

    .line 5
    .line 6
    iget-object v0, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 7
    .line 8
    iget-object v1, p1, LR4/k1;->a:Lcom/web2native/MainActivity;

    .line 9
    .line 10
    iget-object v2, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 11
    .line 12
    const v3, 0x7f050317

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v3}, Landroid/content/Context;->getColor(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const v3, 0xffffff

    .line 20
    .line 21
    .line 22
    and-int/2addr v0, v3

    .line 23
    new-instance v3, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-direct {v3, v0}, Ljava/lang/Integer;-><init>(I)V

    .line 26
    .line 27
    .line 28
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v4, "#%06X"

    .line 38
    .line 39
    invoke-static {v4, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v4, p1, LR4/k1;->M:LO3/e0;

    .line 44
    .line 45
    invoke-virtual {v4}, LO3/e0;->b()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    new-instance v4, LU4/G;

    .line 52
    .line 53
    const/4 v5, 0x2

    .line 54
    invoke-direct {v4, p1, v5}, LU4/G;-><init>(LR4/k1;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    iget-object v4, p1, LR4/k1;->d:LR4/i;

    .line 61
    .line 62
    if-eqz v4, :cond_1

    .line 63
    .line 64
    iget-object v4, v4, LR4/i;->E:Ljava/lang/Boolean;

    .line 65
    .line 66
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    const/4 v4, 0x0

    .line 74
    :goto_0
    if-nez v4, :cond_2

    .line 75
    .line 76
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 77
    .line 78
    const/16 v5, 0x1e

    .line 79
    .line 80
    if-lt v4, v5, :cond_2

    .line 81
    .line 82
    invoke-static {v0, v0, v2, v3}, Lcom/google/android/gms/internal/measurement/P1;->X(Ljava/lang/String;Ljava/lang/String;Lh/h;Z)V

    .line 83
    .line 84
    .line 85
    iget-object v1, p1, LR4/k1;->s:Lj5/c;

    .line 86
    .line 87
    if-eqz v1, :cond_3

    .line 88
    .line 89
    iget-object v1, v1, Lj5/c;->g:Landroidx/lifecycle/J;

    .line 90
    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    new-instance v3, LU4/d0;

    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    invoke-direct {v3, p1, v0, v4}, LU4/d0;-><init>(LR4/k1;Ljava/lang/String;I)V

    .line 97
    .line 98
    .line 99
    new-instance p1, LR4/N;

    .line 100
    .line 101
    const/4 v0, 0x5

    .line 102
    invoke-direct {p1, v3, v0}, LR4/N;-><init>(LB5/c;I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v2, p1}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    invoke-static {v1, v0, v0, v3}, Lcom/google/android/gms/internal/measurement/P1;->Z(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 110
    .line 111
    .line 112
    iget-object v1, p1, LR4/k1;->s:Lj5/c;

    .line 113
    .line 114
    if-eqz v1, :cond_3

    .line 115
    .line 116
    iget-object v1, v1, Lj5/c;->g:Landroidx/lifecycle/J;

    .line 117
    .line 118
    if-eqz v1, :cond_3

    .line 119
    .line 120
    new-instance v3, LU4/d0;

    .line 121
    .line 122
    const/4 v4, 0x1

    .line 123
    invoke-direct {v3, p1, v0, v4}, LU4/d0;-><init>(LR4/k1;Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    new-instance p1, LR4/N;

    .line 127
    .line 128
    const/4 v0, 0x5

    .line 129
    invoke-direct {p1, v3, v0}, LR4/N;-><init>(LB5/c;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v2, p1}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 133
    .line 134
    .line 135
    :cond_3
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 136
    .line 137
    return-object p1
.end method
