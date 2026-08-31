.class public final LQ2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LL2/f;


# instance fields
.field public final a:Lm5/o;

.field public final b:Lm5/o;

.field public final c:LB0/o;


# direct methods
.method public constructor <init>(LR4/b2;)V
    .locals 2

    .line 1
    new-instance v0, LK2/j;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, LK2/j;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, LQ2/i;->q:LQ2/i;

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, LQ2/j;->a:Lm5/o;

    .line 18
    .line 19
    invoke-static {v0}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, LQ2/j;->b:Lm5/o;

    .line 24
    .line 25
    new-instance p1, LB0/o;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p1, LB0/o;->q:Ljava/lang/Object;

    .line 31
    .line 32
    sget-object v0, LR2/b;->a:LR2/b;

    .line 33
    .line 34
    iput-object v0, p1, LB0/o;->r:Ljava/lang/Object;

    .line 35
    .line 36
    iput-object p1, p0, LQ2/j;->c:LB0/o;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;LU2/n;LI2/y;)LL2/g;
    .locals 9

    .line 1
    check-cast p1, LI2/B;

    .line 2
    .line 3
    iget-object v0, p1, LI2/B;->c:Ljava/lang/String;

    .line 4
    .line 5
    const-string v1, "http"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p1, LI2/B;->c:Ljava/lang/String;

    .line 15
    .line 16
    const-string v2, "https"

    .line 17
    .line 18
    invoke-static {v0, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-object v1

    .line 26
    :cond_1
    :goto_0
    new-instance v2, LQ2/q;

    .line 27
    .line 28
    iget-object v3, p1, LI2/B;->a:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v5, p0, LQ2/j;->a:Lm5/o;

    .line 31
    .line 32
    new-instance p1, LI2/d;

    .line 33
    .line 34
    const/4 v0, 0x4

    .line 35
    invoke-direct {p1, v0, p3}, LI2/d;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iget-object v7, p0, LQ2/j;->b:Lm5/o;

    .line 43
    .line 44
    iget-object p1, p0, LQ2/j;->c:LB0/o;

    .line 45
    .line 46
    iget-object p3, p2, LU2/n;->a:Landroid/content/Context;

    .line 47
    .line 48
    iget-object v0, p1, LB0/o;->r:Ljava/lang/Object;

    .line 49
    .line 50
    sget-object v4, LR2/b;->a:LR2/b;

    .line 51
    .line 52
    if-eq v0, v4, :cond_2

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    monitor-enter p1

    .line 56
    :try_start_0
    iget-object v0, p1, LB0/o;->r:Ljava/lang/Object;

    .line 57
    .line 58
    if-eq v0, v4, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    iget-object v0, p1, LB0/o;->q:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, LB5/c;

    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v0, p3}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    iput-object p3, p1, LB0/o;->r:Ljava/lang/Object;

    .line 73
    .line 74
    iput-object v1, p1, LB0/o;->q:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    move-object v0, p3

    .line 77
    :goto_1
    monitor-exit p1

    .line 78
    :goto_2
    move-object v8, v0

    .line 79
    check-cast v8, LQ2/e;

    .line 80
    .line 81
    move-object v4, p2

    .line 82
    invoke-direct/range {v2 .. v8}, LQ2/q;-><init>(Ljava/lang/String;LU2/n;Lm5/o;Lm5/o;Lm5/o;LQ2/e;)V

    .line 83
    .line 84
    .line 85
    return-object v2

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    move-object p2, v0

    .line 88
    monitor-exit p1

    .line 89
    throw p2
.end method
