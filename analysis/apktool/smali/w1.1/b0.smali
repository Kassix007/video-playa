.class public Lw1/b0;
.super Lw1/e0;
.source "SourceFile"


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lw1/e0;-><init>()V

    .line 2
    invoke-static {}, Lt1/a;->h()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, Lw1/b0;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(Lw1/o0;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lw1/e0;-><init>(Lw1/o0;)V

    .line 4
    invoke-virtual {p1}, Lw1/o0;->f()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, Lt1/a;->i(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lt1/a;->h()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lw1/b0;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()Lw1/o0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lw1/e0;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lw1/b0;->c:Landroid/view/WindowInsets$Builder;

    .line 5
    .line 6
    invoke-static {v0}, Lt1/a;->j(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, v0}, Lw1/o0;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lw1/o0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lw1/e0;->b:[Ln1/b;

    .line 16
    .line 17
    iget-object v2, v0, Lw1/o0;->a:Lw1/l0;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Lw1/l0;->r([Ln1/b;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public d(Ln1/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/b0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Ln1/b;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lt1/a;->y(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e(Ln1/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/b0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Ln1/b;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lt1/a;->t(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f(Ln1/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/b0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Ln1/b;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lt1/a;->w(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public g(Ln1/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/b0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Ln1/b;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lt1/a;->p(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public h(Ln1/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/b0;->c:Landroid/view/WindowInsets$Builder;

    .line 2
    .line 3
    invoke-virtual {p1}, Ln1/b;->d()Landroid/graphics/Insets;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {v0, p1}, Lt1/a;->z(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
