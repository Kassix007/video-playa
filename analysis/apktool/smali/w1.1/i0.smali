.class public Lw1/i0;
.super Lw1/h0;
.source "SourceFile"


# instance fields
.field public o:Ln1/b;

.field public p:Ln1/b;

.field public q:Ln1/b;


# direct methods
.method public constructor <init>(Lw1/o0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lw1/h0;-><init>(Lw1/o0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lw1/i0;->o:Ln1/b;

    .line 3
    iput-object p1, p0, Lw1/i0;->p:Ln1/b;

    .line 4
    iput-object p1, p0, Lw1/i0;->q:Ln1/b;

    return-void
.end method

.method public constructor <init>(Lw1/o0;Lw1/i0;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lw1/h0;-><init>(Lw1/o0;Lw1/h0;)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lw1/i0;->o:Ln1/b;

    .line 7
    iput-object p1, p0, Lw1/i0;->p:Ln1/b;

    .line 8
    iput-object p1, p0, Lw1/i0;->q:Ln1/b;

    return-void
.end method


# virtual methods
.method public i()Ln1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/i0;->p:Ln1/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lw1/f0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lt1/a;->r(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ln1/b;->c(Landroid/graphics/Insets;)Ln1/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lw1/i0;->p:Ln1/b;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lw1/i0;->p:Ln1/b;

    .line 18
    .line 19
    return-object v0
.end method

.method public k()Ln1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/i0;->o:Ln1/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lw1/f0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lt1/a;->u(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ln1/b;->c(Landroid/graphics/Insets;)Ln1/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lw1/i0;->o:Ln1/b;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lw1/i0;->o:Ln1/b;

    .line 18
    .line 19
    return-object v0
.end method

.method public m()Ln1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/i0;->q:Ln1/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lw1/f0;->c:Landroid/view/WindowInsets;

    .line 6
    .line 7
    invoke-static {v0}, Lt1/a;->d(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ln1/b;->c(Landroid/graphics/Insets;)Ln1/b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lw1/i0;->q:Ln1/b;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lw1/i0;->q:Ln1/b;

    .line 18
    .line 19
    return-object v0
.end method

.method public n(IIII)Lw1/o0;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/f0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3, p4}, Lt1/a;->k(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 p2, 0x0

    .line 8
    invoke-static {p2, p1}, Lw1/o0;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lw1/o0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public u(Ln1/b;)V
    .locals 0

    .line 1
    return-void
.end method
