.class public final Lj3/g;
.super Lj3/b;
.source "SourceFile"


# instance fields
.field public final D:Lc3/e;

.field public final E:Lj3/c;

.field public final F:Ld3/h;


# direct methods
.method public constructor <init>(La3/y;Lj3/e;Lj3/c;La3/k;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Lj3/b;-><init>(La3/y;Lj3/e;)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lj3/g;->E:Lj3/c;

    .line 5
    .line 6
    new-instance p3, Li3/n;

    .line 7
    .line 8
    iget-object p2, p2, Lj3/e;->a:Ljava/util/List;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    const-string v1, "__container"

    .line 12
    .line 13
    invoke-direct {p3, v1, p2, v0}, Li3/n;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    .line 14
    .line 15
    .line 16
    new-instance p2, Lc3/e;

    .line 17
    .line 18
    invoke-direct {p2, p1, p0, p3, p4}, Lc3/e;-><init>(La3/y;Lj3/b;Li3/n;La3/k;)V

    .line 19
    .line 20
    .line 21
    iput-object p2, p0, Lj3/g;->D:Lc3/e;

    .line 22
    .line 23
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 24
    .line 25
    invoke-virtual {p2, p1, p1}, Lc3/e;->c(Ljava/util/List;Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lj3/b;->p:Lj3/e;

    .line 29
    .line 30
    iget-object p1, p1, Lj3/e;->x:LL0/l;

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    new-instance p2, Ld3/h;

    .line 35
    .line 36
    invoke-direct {p2, p0, p0, p1}, Ld3/h;-><init>(Lj3/b;Lj3/b;LL0/l;)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lj3/g;->F:Ld3/h;

    .line 40
    .line 41
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2, p3}, Lj3/b;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lj3/g;->D:Lc3/e;

    .line 5
    .line 6
    iget-object v0, p0, Lj3/b;->n:Landroid/graphics/Matrix;

    .line 7
    .line 8
    invoke-virtual {p2, p1, v0, p3}, Lc3/e;->a(Landroid/graphics/RectF;Landroid/graphics/Matrix;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final f(LZ/m;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lj3/b;->f(LZ/m;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object v0, La3/C;->a:Landroid/graphics/PointF;

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lj3/g;->F:Ld3/h;

    .line 12
    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object p2, v1, Ld3/h;->c:Ld3/f;

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Ld3/e;->j(LZ/m;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    sget-object v0, La3/C;->B:Ljava/lang/Float;

    .line 24
    .line 25
    if-ne p2, v0, :cond_1

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ld3/h;->c(LZ/m;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    sget-object v0, La3/C;->C:Ljava/lang/Float;

    .line 34
    .line 35
    if-ne p2, v0, :cond_2

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    iget-object p2, v1, Ld3/h;->e:Ld3/i;

    .line 40
    .line 41
    invoke-virtual {p2, p1}, Ld3/e;->j(LZ/m;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    sget-object v0, La3/C;->D:Ljava/lang/Float;

    .line 46
    .line 47
    if-ne p2, v0, :cond_3

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    iget-object p2, v1, Ld3/h;->f:Ld3/i;

    .line 52
    .line 53
    invoke-virtual {p2, p1}, Ld3/e;->j(LZ/m;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    sget-object v0, La3/C;->E:Ljava/lang/Float;

    .line 58
    .line 59
    if-ne p2, v0, :cond_4

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    iget-object p2, v1, Ld3/h;->g:Ld3/i;

    .line 64
    .line 65
    invoke-virtual {p2, p1}, Ld3/e;->j(LZ/m;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    return-void
.end method

.method public final k(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILn3/a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/g;->F:Ld3/h;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p2, p3}, Ld3/h;->a(Landroid/graphics/Matrix;I)Ln3/a;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    :cond_0
    iget-object v0, p0, Lj3/g;->D:Lc3/e;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3, p4}, Lc3/e;->g(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILn3/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final l()Li3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/b;->p:Lj3/e;

    .line 2
    .line 3
    iget-object v0, v0, Lj3/e;->w:Li3/a;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lj3/g;->E:Lj3/c;

    .line 9
    .line 10
    iget-object v0, v0, Lj3/b;->p:Lj3/e;

    .line 11
    .line 12
    iget-object v0, v0, Lj3/e;->w:Li3/a;

    .line 13
    .line 14
    return-object v0
.end method

.method public final p(Lg3/e;ILjava/util/ArrayList;Lg3/e;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj3/g;->D:Lc3/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lc3/e;->h(Lg3/e;ILjava/util/ArrayList;Lg3/e;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
