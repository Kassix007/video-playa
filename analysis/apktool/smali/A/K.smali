.class public final LA/K;
.super Lc0/l;
.source "SourceFile"

# interfaces
.implements LB0/z;


# instance fields
.field public E:F

.field public F:F

.field public G:F

.field public H:F

.field public I:Z


# virtual methods
.method public final c(LB0/T;Lz0/B;J)Lz0/D;
    .locals 5

    .line 1
    iget v0, p0, LA/K;->E:F

    .line 2
    .line 3
    invoke-interface {p1, v0}, LW0/c;->G(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, LA/K;->G:F

    .line 8
    .line 9
    invoke-interface {p1, v1}, LW0/c;->G(F)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    iget v0, p0, LA/K;->F:F

    .line 15
    .line 16
    invoke-interface {p1, v0}, LW0/c;->G(F)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget v2, p0, LA/K;->H:F

    .line 21
    .line 22
    invoke-interface {p1, v2}, LW0/c;->G(F)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/2addr v2, v0

    .line 27
    neg-int v0, v1

    .line 28
    neg-int v3, v2

    .line 29
    invoke-static {v0, v3, p3, p4}, LW0/b;->h(IIJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    invoke-interface {p2, v3, v4}, Lz0/B;->a(J)Lz0/J;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget v0, p2, Lz0/J;->q:I

    .line 38
    .line 39
    add-int/2addr v0, v1

    .line 40
    invoke-static {v0, p3, p4}, LW0/b;->f(IJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v1, p2, Lz0/J;->r:I

    .line 45
    .line 46
    add-int/2addr v1, v2

    .line 47
    invoke-static {v1, p3, p4}, LW0/b;->e(IJ)I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    new-instance p4, LA/J;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-direct {p4, p0, p2, p1, v1}, LA/J;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 55
    .line 56
    .line 57
    sget-object p2, Ln5/t;->q:Ln5/t;

    .line 58
    .line 59
    invoke-interface {p1, v0, p3, p2, p4}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1
.end method
