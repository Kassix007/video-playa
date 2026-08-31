.class public abstract LC0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    .line 4
    new-array v0, v0, [I

    iput-object v0, p0, LC0/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LJ1/T;Lr1/b;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, LC0/b;->a:Ljava/lang/Object;

    .line 7
    iput-object p2, p0, LC0/b;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LC0/b;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lh/y;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC0/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, LC0/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/v;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, LC0/b;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lh/y;

    .line 10
    .line 11
    iget-object v1, v1, Lh/y;->A:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    :catch_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, LC0/b;->a:Ljava/lang/Object;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, LC0/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LJ1/T;

    .line 4
    .line 5
    iget-object v1, p0, LC0/b;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lr1/b;

    .line 8
    .line 9
    iget-object v2, v0, LJ1/T;->e:Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, LJ1/T;->b()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public abstract e()Landroid/content/IntentFilter;
.end method

.method public abstract f(I)[I
.end method

.method public abstract g()I
.end method

.method public h(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    .line 1
    instance-of v0, p1, Lp1/a;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Lp1/a;

    .line 6
    .line 7
    iget-object v0, p0, LC0/b;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lr/Q;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lr/Q;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, Lr/Q;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LC0/b;->b:Ljava/lang/Object;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, LC0/b;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lr/Q;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lr/Q;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroid/view/MenuItem;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    new-instance v0, Ll/s;

    .line 34
    .line 35
    iget-object v1, p0, LC0/b;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Landroid/content/Context;

    .line 38
    .line 39
    invoke-direct {v0, v1, p1}, Ll/s;-><init>(Landroid/content/Context;Lp1/a;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, LC0/b;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Lr/Q;

    .line 45
    .line 46
    invoke-virtual {v1, p1, v0}, Lr/Q;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_1
    return-object v0

    .line 50
    :cond_2
    return-object p1
.end method

.method public i(II)[I
    .locals 2

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    if-ltz p2, :cond_1

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, LC0/b;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, [I

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    aput p1, v0, v1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    aput p2, v0, p1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/b;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v0, "text"

    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    throw v0
.end method

.method public abstract k()V
.end method

.method public abstract l(I)[I
.end method

.method public m()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LC0/b;->c()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LC0/b;->e()Landroid/content/IntentFilter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v1, p0, LC0/b;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Lh/v;

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    new-instance v1, Lh/v;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lh/v;-><init>(LC0/b;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, LC0/b;->a:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, LC0/b;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lh/y;

    .line 31
    .line 32
    iget-object v1, v1, Lh/y;->A:Landroid/content/Context;

    .line 33
    .line 34
    iget-object v2, p0, LC0/b;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lh/v;

    .line 37
    .line 38
    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    return-void
.end method
