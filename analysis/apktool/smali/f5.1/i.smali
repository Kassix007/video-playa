.class public final Lf5/i;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:LR4/O1;

.field public final synthetic s:Lcom/web2native/MainActivity;


# direct methods
.method public constructor <init>(LR4/k1;LR4/O1;Lcom/web2native/MainActivity;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf5/i;->q:LR4/k1;

    .line 2
    .line 3
    iput-object p2, p0, Lf5/i;->r:LR4/O1;

    .line 4
    .line 5
    iput-object p3, p0, Lf5/i;->s:Lcom/web2native/MainActivity;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Ls5/i;-><init>(ILq5/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance p1, Lf5/i;

    .line 2
    .line 3
    iget-object v0, p0, Lf5/i;->r:LR4/O1;

    .line 4
    .line 5
    iget-object v1, p0, Lf5/i;->s:Lcom/web2native/MainActivity;

    .line 6
    .line 7
    iget-object v2, p0, Lf5/i;->q:LR4/k1;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Lf5/i;-><init>(LR4/k1;LR4/O1;Lcom/web2native/MainActivity;Lq5/c;)V

    .line 10
    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, Lf5/i;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lf5/i;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lf5/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lf5/i;->r:LR4/O1;

    .line 2
    .line 3
    iget-object v1, v0, LR4/O1;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lf5/i;->q:LR4/k1;

    .line 9
    .line 10
    iget-object v2, p1, LR4/k1;->d:LR4/i;

    .line 11
    .line 12
    iget-object v3, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v2, v2, LR4/i;->E:Ljava/lang/Boolean;

    .line 17
    .line 18
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {v2, v4}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x0

    .line 26
    :goto_0
    if-nez v2, :cond_1

    .line 27
    .line 28
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v4, 0x1e

    .line 31
    .line 32
    if-lt v2, v4, :cond_1

    .line 33
    .line 34
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/16 v2, 0x8

    .line 38
    .line 39
    invoke-static {v1, v1, v3, v2}, Lcom/google/android/gms/internal/measurement/P1;->Y(Ljava/lang/String;Ljava/lang/String;Lh/h;I)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p1, LR4/k1;->s:Lj5/c;

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    iget-object v1, v1, Lj5/c;->g:Landroidx/lifecycle/J;

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    new-instance v2, LN5/d;

    .line 51
    .line 52
    const/16 v4, 0xc

    .line 53
    .line 54
    invoke-direct {v2, v4, v0, p1}, LN5/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, LR4/N;

    .line 58
    .line 59
    const/16 v0, 0x9

    .line 60
    .line 61
    invoke-direct {p1, v2, v0}, LR4/N;-><init>(LB5/c;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v3, p1}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const/4 v2, 0x1

    .line 72
    iget-object v4, p0, Lf5/i;->s:Lcom/web2native/MainActivity;

    .line 73
    .line 74
    invoke-static {v4, v1, v1, v2}, Lcom/google/android/gms/internal/measurement/P1;->Z(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    iget-object p1, p1, LR4/k1;->s:Lj5/c;

    .line 78
    .line 79
    if-eqz p1, :cond_2

    .line 80
    .line 81
    iget-object p1, p1, Lj5/c;->g:Landroidx/lifecycle/J;

    .line 82
    .line 83
    if-eqz p1, :cond_2

    .line 84
    .line 85
    new-instance v1, LN5/d;

    .line 86
    .line 87
    const/16 v2, 0xd

    .line 88
    .line 89
    invoke-direct {v1, v2, v4, v0}, LN5/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance v0, LR4/N;

    .line 93
    .line 94
    const/16 v2, 0x9

    .line 95
    .line 96
    invoke-direct {v0, v1, v2}, LR4/N;-><init>(LB5/c;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, v3, v0}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 100
    .line 101
    .line 102
    :cond_2
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 103
    .line 104
    return-object p1
.end method
