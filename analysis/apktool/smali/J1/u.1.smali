.class public final LJ1/u;
.super LC3/a;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/l0;
.implements Lb/B;
.implements Lg2/e;
.implements LJ1/L;


# instance fields
.field public final t:Lh/h;

.field public final u:Lh/h;

.field public final v:Landroid/os/Handler;

.field public final w:LJ1/H;

.field public final synthetic x:Lh/h;


# direct methods
.method public constructor <init>(Lh/h;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ1/u;->x:Lh/h;

    .line 5
    .line 6
    new-instance v0, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, LJ1/H;

    .line 12
    .line 13
    invoke-direct {v1}, LJ1/H;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, LJ1/u;->w:LJ1/H;

    .line 17
    .line 18
    iput-object p1, p0, LJ1/u;->t:Lh/h;

    .line 19
    .line 20
    iput-object p1, p0, LJ1/u;->u:Lh/h;

    .line 21
    .line 22
    iput-object v0, p0, LJ1/u;->v:Landroid/os/Handler;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final J(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/u;->x:Lh/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lh/h;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final K()Z
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/u;->x:Lh/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method public final a()Lb/A;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/u;->x:Lh/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb/l;->a()Lb/A;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final b()LZ/m;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/u;->x:Lh/h;

    .line 2
    .line 3
    iget-object v0, v0, Lb/l;->t:LZ/m;

    .line 4
    .line 5
    iget-object v0, v0, LZ/m;->s:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LZ/m;

    .line 8
    .line 9
    return-object v0
.end method

.method public final c()V
    .locals 0

    .line 1
    return-void
.end method

.method public final f()Landroidx/lifecycle/k0;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/u;->x:Lh/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb/l;->f()Landroidx/lifecycle/k0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getLifecycle()Landroidx/lifecycle/q;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/u;->x:Lh/h;

    .line 2
    .line 3
    iget-object v0, v0, Lh/h;->L:Landroidx/lifecycle/z;

    .line 4
    .line 5
    return-object v0
.end method
