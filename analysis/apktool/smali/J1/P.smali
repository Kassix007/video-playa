.class public final LJ1/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/k;
.implements Lg2/e;
.implements Landroidx/lifecycle/l0;


# instance fields
.field public final q:LJ1/q;

.field public final r:Landroidx/lifecycle/k0;

.field public s:Landroidx/lifecycle/h0;

.field public t:Landroidx/lifecycle/z;

.field public u:LZ/m;


# direct methods
.method public constructor <init>(LJ1/q;Landroidx/lifecycle/k0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, LJ1/P;->t:Landroidx/lifecycle/z;

    .line 6
    .line 7
    iput-object v0, p0, LJ1/P;->u:LZ/m;

    .line 8
    .line 9
    iput-object p1, p0, LJ1/P;->q:LJ1/q;

    .line 10
    .line 11
    iput-object p2, p0, LJ1/P;->r:Landroidx/lifecycle/k0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final b()LZ/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, LJ1/P;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LJ1/P;->u:LZ/m;

    .line 5
    .line 6
    iget-object v0, v0, LZ/m;->s:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LZ/m;

    .line 9
    .line 10
    return-object v0
.end method

.method public final c(Landroidx/lifecycle/o;)V
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/P;->t:Landroidx/lifecycle/z;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()Landroidx/lifecycle/h0;
    .locals 3

    .line 1
    iget-object v0, p0, LJ1/P;->q:LJ1/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ1/q;->d()Landroidx/lifecycle/h0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, LJ1/q;->f0:Landroidx/lifecycle/a0;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    iput-object v1, p0, LJ1/P;->s:Landroidx/lifecycle/h0;

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    iget-object v1, p0, LJ1/P;->s:Landroidx/lifecycle/h0;

    .line 19
    .line 20
    if-nez v1, :cond_3

    .line 21
    .line 22
    invoke-virtual {v0}, LJ1/q;->C()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    instance-of v2, v1, Landroid/app/Application;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    check-cast v1, Landroid/app/Application;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    check-cast v1, Landroid/content/ContextWrapper;

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 v1, 0x0

    .line 49
    :goto_1
    new-instance v2, Landroidx/lifecycle/a0;

    .line 50
    .line 51
    iget-object v0, v0, LJ1/q;->v:Landroid/os/Bundle;

    .line 52
    .line 53
    invoke-direct {v2, v1, p0, v0}, Landroidx/lifecycle/a0;-><init>(Landroid/app/Application;Lg2/e;Landroid/os/Bundle;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, p0, LJ1/P;->s:Landroidx/lifecycle/h0;

    .line 57
    .line 58
    :cond_3
    iget-object v0, p0, LJ1/P;->s:Landroidx/lifecycle/h0;

    .line 59
    .line 60
    return-object v0
.end method

.method public final e()LP1/e;
    .locals 5

    .line 1
    iget-object v0, p0, LJ1/P;->q:LJ1/q;

    .line 2
    .line 3
    invoke-virtual {v0}, LJ1/q;->C()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    instance-of v2, v1, Landroid/app/Application;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, Landroid/app/Application;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    check-cast v1, Landroid/content/ContextWrapper;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_1
    new-instance v2, LP1/e;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-direct {v2, v3}, LP1/e;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iget-object v3, v2, LP1/c;->a:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    sget-object v4, Landroidx/lifecycle/g0;->d:LO3/B;

    .line 41
    .line 42
    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    :cond_2
    sget-object v1, Landroidx/lifecycle/X;->a:LO3/D;

    .line 46
    .line 47
    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    sget-object v1, Landroidx/lifecycle/X;->b:LO3/B;

    .line 51
    .line 52
    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    iget-object v0, v0, LJ1/q;->v:Landroid/os/Bundle;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    sget-object v1, Landroidx/lifecycle/X;->c:LO3/D;

    .line 60
    .line 61
    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_3
    return-object v2
.end method

.method public final f()Landroidx/lifecycle/k0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LJ1/P;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LJ1/P;->r:Landroidx/lifecycle/k0;

    .line 5
    .line 6
    return-object v0
.end method

.method public final g()V
    .locals 3

    .line 1
    iget-object v0, p0, LJ1/P;->t:Landroidx/lifecycle/z;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/z;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/lifecycle/z;-><init>(Landroidx/lifecycle/x;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LJ1/P;->t:Landroidx/lifecycle/z;

    .line 11
    .line 12
    new-instance v0, Li2/a;

    .line 13
    .line 14
    new-instance v1, LI2/d;

    .line 15
    .line 16
    const/16 v2, 0x10

    .line 17
    .line 18
    invoke-direct {v1, v2, p0}, LI2/d;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0, v1}, Li2/a;-><init>(Lg2/e;LI2/d;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, LZ/m;

    .line 25
    .line 26
    const/16 v2, 0xd

    .line 27
    .line 28
    invoke-direct {v1, v0, v2}, LZ/m;-><init>(Li2/a;I)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, LJ1/P;->u:LZ/m;

    .line 32
    .line 33
    invoke-virtual {v0}, Li2/a;->a()V

    .line 34
    .line 35
    .line 36
    invoke-static {p0}, Landroidx/lifecycle/X;->c(Lg2/e;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final getLifecycle()Landroidx/lifecycle/q;
    .locals 1

    .line 1
    invoke-virtual {p0}, LJ1/P;->g()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LJ1/P;->t:Landroidx/lifecycle/z;

    .line 5
    .line 6
    return-object v0
.end method
