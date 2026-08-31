.class public final LA/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/o;
.implements LA0/c;
.implements Lc0/k;


# instance fields
.field public final q:LA/W;

.field public final r:LP/f0;

.field public final s:LP/f0;


# direct methods
.method public constructor <init>(LA/W;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA/F;->q:LA/W;

    .line 5
    .line 6
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, LA/F;->r:LP/f0;

    .line 11
    .line 12
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, LA/F;->s:LP/f0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final c(LB0/T;Lz0/B;J)Lz0/D;
    .locals 6

    .line 1
    iget-object v0, p0, LA/F;->r:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, LA/W;

    .line 8
    .line 9
    invoke-interface {p1}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v1, p1, v2}, LA/W;->c(LW0/c;LW0/l;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, LA/W;

    .line 22
    .line 23
    invoke-interface {v2, p1}, LA/W;->d(LW0/c;)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, LA/W;

    .line 32
    .line 33
    invoke-interface {p1}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-interface {v3, p1, v4}, LA/W;->a(LW0/c;LW0/l;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, LA/W;

    .line 46
    .line 47
    invoke-interface {v0, p1}, LA/W;->b(LW0/c;)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    add-int/2addr v3, v1

    .line 52
    add-int/2addr v0, v2

    .line 53
    neg-int v4, v3

    .line 54
    neg-int v5, v0

    .line 55
    invoke-static {v4, v5, p3, p4}, LW0/b;->h(IIJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v4

    .line 59
    invoke-interface {p2, v4, v5}, Lz0/B;->a(J)Lz0/J;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    iget v4, p2, Lz0/J;->q:I

    .line 64
    .line 65
    add-int/2addr v4, v3

    .line 66
    invoke-static {v4, p3, p4}, LW0/b;->f(IJ)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    iget v4, p2, Lz0/J;->r:I

    .line 71
    .line 72
    add-int/2addr v4, v0

    .line 73
    invoke-static {v4, p3, p4}, LW0/b;->e(IJ)I

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    new-instance p4, LA/E;

    .line 78
    .line 79
    invoke-direct {p4, p2, v1, v2}, LA/E;-><init>(Lz0/J;II)V

    .line 80
    .line 81
    .line 82
    sget-object p2, Ln5/t;->q:Ln5/t;

    .line 83
    .line 84
    invoke-interface {p1, v3, p3, p2, p4}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1
.end method

.method public final e(LA0/g;)V
    .locals 3

    .line 1
    sget-object v0, LA/c0;->a:LA0/h;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LA0/g;->e(LA0/h;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LA/W;

    .line 8
    .line 9
    new-instance v0, LA/y;

    .line 10
    .line 11
    iget-object v1, p0, LA/F;->q:LA/W;

    .line 12
    .line 13
    invoke-direct {v0, v1, p1}, LA/y;-><init>(LA/W;LA/W;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, LA/F;->r:LP/f0;

    .line 17
    .line 18
    invoke-virtual {v2, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, LA/U;

    .line 22
    .line 23
    invoke-direct {v0, p1, v1}, LA/U;-><init>(LA/W;LA/W;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, LA/F;->s:LP/f0;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, LA/F;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    check-cast p1, LA/F;

    .line 12
    .line 13
    iget-object p1, p1, LA/F;->q:LA/W;

    .line 14
    .line 15
    iget-object v0, p0, LA/F;->q:LA/W;

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LA/F;->q:LA/W;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
