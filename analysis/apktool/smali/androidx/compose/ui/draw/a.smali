.class public abstract Landroidx/compose/ui/draw/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lc0/m;LB5/c;)Lc0/m;
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/draw/DrawBehindElement;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/compose/ui/draw/DrawBehindElement;-><init>(LB5/c;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static b(Lc0/m;Lo0/b;Lz0/j;FLj0/j;I)Lc0/m;
    .locals 6

    .line 1
    sget-object v2, Lc0/b;->u:Lc0/e;

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x10

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    const/high16 p3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    :cond_0
    move v4, p3

    .line 10
    new-instance v0, Landroidx/compose/ui/draw/PainterElement;

    .line 11
    .line 12
    move-object v1, p1

    .line 13
    move-object v3, p2

    .line 14
    move-object v5, p4

    .line 15
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/draw/PainterElement;-><init>(Lo0/b;Lc0/e;Lz0/j;FLj0/j;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v0}, Lc0/m;->d(Lc0/m;)Lc0/m;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
