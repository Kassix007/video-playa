.class public final Lc5/b;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:LR4/k1;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lcom/web2native/MainActivity;


# direct methods
.method public constructor <init>(LR4/k1;Ljava/lang/String;Lcom/web2native/MainActivity;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc5/b;->q:LR4/k1;

    .line 2
    .line 3
    iput-object p2, p0, Lc5/b;->r:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lc5/b;->s:Lcom/web2native/MainActivity;

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
    new-instance p1, Lc5/b;

    .line 2
    .line 3
    iget-object v0, p0, Lc5/b;->r:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lc5/b;->s:Lcom/web2native/MainActivity;

    .line 6
    .line 7
    iget-object v2, p0, Lc5/b;->q:LR4/k1;

    .line 8
    .line 9
    invoke-direct {p1, v2, v0, v1, p2}, Lc5/b;-><init>(LR4/k1;Ljava/lang/String;Lcom/web2native/MainActivity;Lq5/c;)V

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
    invoke-virtual {p0, p1, p2}, Lc5/b;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lc5/b;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lc5/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lc5/b;->q:LR4/k1;

    .line 5
    .line 6
    iget-object v0, p1, LR4/k1;->d:LR4/i;

    .line 7
    .line 8
    iget-object v1, p1, LR4/k1;->b:Lcom/web2native/MainActivity;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, LR4/i;->E:Ljava/lang/Boolean;

    .line 13
    .line 14
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    iget-object v2, p0, Lc5/b;->r:Ljava/lang/String;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v3, 0x1e

    .line 29
    .line 30
    if-lt v0, v3, :cond_1

    .line 31
    .line 32
    const/16 v0, 0x8

    .line 33
    .line 34
    invoke-static {v2, v2, v1, v0}, Lcom/google/android/gms/internal/measurement/P1;->Y(Ljava/lang/String;Ljava/lang/String;Lh/h;I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p1, LR4/k1;->s:Lj5/c;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, v0, Lj5/c;->g:Landroidx/lifecycle/J;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    new-instance v3, LU4/d0;

    .line 46
    .line 47
    const/4 v4, 0x2

    .line 48
    invoke-direct {v3, p1, v2, v4}, LU4/d0;-><init>(LR4/k1;Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    new-instance p1, LR4/N;

    .line 52
    .line 53
    const/16 v2, 0x8

    .line 54
    .line 55
    invoke-direct {p1, v3, v2}, LR4/N;-><init>(LB5/c;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const/4 v0, 0x1

    .line 63
    iget-object v3, p0, Lc5/b;->s:Lcom/web2native/MainActivity;

    .line 64
    .line 65
    invoke-static {v3, v2, v2, v0}, Lcom/google/android/gms/internal/measurement/P1;->Z(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p1, LR4/k1;->s:Lj5/c;

    .line 69
    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    iget-object p1, p1, Lj5/c;->g:Landroidx/lifecycle/J;

    .line 73
    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    new-instance v0, LN5/d;

    .line 77
    .line 78
    const/16 v4, 0xa

    .line 79
    .line 80
    invoke-direct {v0, v4, v3, v2}, LN5/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    new-instance v2, LR4/N;

    .line 84
    .line 85
    const/16 v3, 0x8

    .line 86
    .line 87
    invoke-direct {v2, v0, v3}, LR4/N;-><init>(LB5/c;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v1, v2}, Landroidx/lifecycle/G;->e(Landroidx/lifecycle/x;Landroidx/lifecycle/K;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_1
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 94
    .line 95
    return-object p1
.end method
