.class public final Lp4/a;
.super Lcom/google/android/gms/internal/measurement/K1;
.source "SourceFile"


# instance fields
.field public final c:Landroid/graphics/Typeface;

.field public final d:Li3/a;

.field public e:Z


# direct methods
.method public constructor <init>(Li3/a;Landroid/graphics/Typeface;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lp4/a;->c:Landroid/graphics/Typeface;

    .line 5
    .line 6
    iput-object p1, p0, Lp4/a;->d:Li3/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final A(I)V
    .locals 1

    .line 1
    iget-boolean p1, p0, Lp4/a;->e:Z

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lp4/a;->d:Li3/a;

    .line 6
    .line 7
    iget-object p1, p1, Li3/a;->r:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Ll4/b;

    .line 10
    .line 11
    iget-object v0, p0, Lp4/a;->c:Landroid/graphics/Typeface;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ll4/b;->j(Landroid/graphics/Typeface;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Ll4/b;->h(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final B(Landroid/graphics/Typeface;Z)V
    .locals 0

    .line 1
    iget-boolean p2, p0, Lp4/a;->e:Z

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    iget-object p2, p0, Lp4/a;->d:Li3/a;

    .line 6
    .line 7
    iget-object p2, p2, Li3/a;->r:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Ll4/b;

    .line 10
    .line 11
    invoke-virtual {p2, p1}, Ll4/b;->j(Landroid/graphics/Typeface;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p2, p1}, Ll4/b;->h(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
