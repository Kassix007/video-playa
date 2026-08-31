.class public final LE/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz0/E;


# instance fields
.field public final q:LE/u;

.field public final r:Lz0/T;

.field public final s:LE/x;

.field public final t:Lr/v;


# direct methods
.method public constructor <init>(LE/u;Lz0/T;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE/A;->q:LE/u;

    .line 5
    .line 6
    iput-object p2, p0, LE/A;->r:Lz0/T;

    .line 7
    .line 8
    iget-object p1, p1, LE/u;->b:LC/j;

    .line 9
    .line 10
    invoke-virtual {p1}, LC/j;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, LE/x;

    .line 15
    .line 16
    iput-object p1, p0, LE/A;->s:LE/x;

    .line 17
    .line 18
    sget-object p1, Lr/l;->a:Lr/v;

    .line 19
    .line 20
    new-instance p1, Lr/v;

    .line 21
    .line 22
    invoke-direct {p1}, Lr/v;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LE/A;->t:Lr/v;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final D(J)F
    .locals 1

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LW0/c;->D(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final G(F)I
    .locals 1

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->G(F)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final O(IILjava/util/Map;LB5/c;)Lz0/D;
    .locals 1

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Lz0/E;->O(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final Q(J)J
    .locals 1

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LW0/c;->Q(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public final T(J)F
    .locals 1

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LW0/c;->T(J)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final a(IJ)Ljava/util/List;
    .locals 6

    .line 1
    iget-object v0, p0, LE/A;->t:Lr/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lr/k;->b(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/util/List;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    iget-object v1, p0, LE/A;->s:LE/x;

    .line 13
    .line 14
    invoke-interface {v1, p1}, LE/x;->b(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v1, p1}, LE/x;->c(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v3, p0, LE/A;->q:LE/u;

    .line 23
    .line 24
    invoke-virtual {v3, p1, v2, v1}, LE/u;->a(ILjava/lang/Object;Ljava/lang/Object;)LB5/e;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v3, p0, LE/A;->r:Lz0/T;

    .line 29
    .line 30
    invoke-interface {v3, v2, v1}, Lz0/T;->H(Ljava/lang/Object;LB5/e;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    new-instance v3, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    :goto_0
    if-ge v4, v2, :cond_1

    .line 45
    .line 46
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    check-cast v5, Lz0/B;

    .line 51
    .line 52
    invoke-interface {v5, p2, p3}, Lz0/B;->a(J)Lz0/J;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    add-int/lit8 v4, v4, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {v0, p1, v3}, Lr/v;->h(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    return-object v3
.end method

.method public final a0(F)J
    .locals 2

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->a0(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0}, LW0/c;->b()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final f(IILjava/util/Map;LB5/c;)Lz0/D;
    .locals 1

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Lz0/E;->f(IILjava/util/Map;LB5/c;)Lz0/D;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final f0(I)F
    .locals 1

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->f0(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final getLayoutDirection()LW0/l;
    .locals 1

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final i0(F)F
    .locals 1

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->i0(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final l()F
    .locals 1

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0}, LW0/c;->l()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0}, Lz0/E;->r()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final s(F)J
    .locals 2

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->s(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(F)F
    .locals 1

    .line 1
    iget-object v0, p0, LE/A;->r:Lz0/T;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW0/c;->u(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
