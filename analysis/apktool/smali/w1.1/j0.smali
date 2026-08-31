.class public Lw1/j0;
.super Lw1/i0;
.source "SourceFile"


# static fields
.field public static final r:Lw1/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lw1/V;->d()Landroid/view/WindowInsets;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1, v0}, Lw1/o0;->g(Landroid/view/View;Landroid/view/WindowInsets;)Lw1/o0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lw1/j0;->r:Lw1/o0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lw1/o0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lw1/i0;-><init>(Lw1/o0;Landroid/view/WindowInsets;)V

    return-void
.end method

.method public constructor <init>(Lw1/o0;Lw1/j0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lw1/i0;-><init>(Lw1/o0;Lw1/i0;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public g(I)Ln1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/f0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lw1/m0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {v0, p1}, Lw1/V;->c(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Ln1/b;->c(Landroid/graphics/Insets;)Ln1/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public h(I)Ln1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/f0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lw1/m0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {v0, p1}, Lw1/V;->n(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Ln1/b;->c(Landroid/graphics/Insets;)Ln1/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public q(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lw1/f0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lw1/m0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {v0, p1}, Lw1/V;->l(Landroid/view/WindowInsets;I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
