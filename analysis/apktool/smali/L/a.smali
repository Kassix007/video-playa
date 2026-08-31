.class public final LL/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LP/w0;
.implements LL/j;
.implements Lv/Q;


# instance fields
.field public A:J

.field public B:I

.field public final C:LA0/d;

.field public final q:Z

.field public final r:LL/s;

.field public final s:Z

.field public final t:F

.field public final u:LP/W;

.field public final v:LP/W;

.field public final w:Landroid/view/ViewGroup;

.field public x:LL/i;

.field public final y:LP/f0;

.field public final z:LP/f0;


# direct methods
.method public constructor <init>(ZFLP/W;LP/W;Landroid/view/ViewGroup;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, LL/a;->q:Z

    .line 5
    .line 6
    new-instance v0, LL/s;

    .line 7
    .line 8
    new-instance v1, LC/j;

    .line 9
    .line 10
    const/4 v2, 0x3

    .line 11
    invoke-direct {v1, p4, v2}, LC/j;-><init>(LP/W;I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p1, v1}, LL/s;-><init>(ZLB5/a;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, LL/a;->r:LL/s;

    .line 18
    .line 19
    iput-boolean p1, p0, LL/a;->s:Z

    .line 20
    .line 21
    iput p2, p0, LL/a;->t:F

    .line 22
    .line 23
    iput-object p3, p0, LL/a;->u:LP/W;

    .line 24
    .line 25
    iput-object p4, p0, LL/a;->v:LP/W;

    .line 26
    .line 27
    iput-object p5, p0, LL/a;->w:Landroid/view/ViewGroup;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, LL/a;->y:LP/f0;

    .line 35
    .line 36
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, LL/a;->z:LP/f0;

    .line 43
    .line 44
    const-wide/16 p1, 0x0

    .line 45
    .line 46
    iput-wide p1, p0, LL/a;->A:J

    .line 47
    .line 48
    const/4 p1, -0x1

    .line 49
    iput p1, p0, LL/a;->B:I

    .line 50
    .line 51
    new-instance p1, LA0/d;

    .line 52
    .line 53
    const/4 p2, 0x5

    .line 54
    invoke-direct {p1, p2, p0}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, LL/a;->C:LA0/d;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final Y()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LL/a;->y:LP/f0;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final a(LB0/N;)V
    .locals 10

    .line 1
    iget-object v0, p1, LB0/N;->q:Ll0/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ll0/d;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iput-wide v1, p0, LL/a;->A:J

    .line 8
    .line 9
    iget v1, p0, LL/a;->t:F

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-boolean v2, p0, LL/a;->s:Z

    .line 18
    .line 19
    invoke-interface {v0}, Ll0/d;->d()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    invoke-static {p1, v2, v3, v4}, LL/h;->a(LW0/c;ZJ)F

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-static {v2}, LD5/a;->G(F)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-interface {v0, v1}, LW0/c;->G(F)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    :goto_0
    iput v2, p0, LL/a;->B:I

    .line 37
    .line 38
    iget-object v2, p0, LL/a;->u:LP/W;

    .line 39
    .line 40
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Lj0/o;

    .line 45
    .line 46
    iget-wide v7, v2, Lj0/o;->a:J

    .line 47
    .line 48
    iget-object v2, p0, LL/a;->v:LP/W;

    .line 49
    .line 50
    invoke-interface {v2}, LP/S0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, LL/g;

    .line 55
    .line 56
    iget v9, v2, LL/g;->d:F

    .line 57
    .line 58
    invoke-virtual {p1}, LB0/N;->a()V

    .line 59
    .line 60
    .line 61
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    iget-boolean v1, p0, LL/a;->q:Z

    .line 68
    .line 69
    invoke-interface {v0}, Ll0/d;->d()J

    .line 70
    .line 71
    .line 72
    move-result-wide v2

    .line 73
    invoke-static {p1, v1, v2, v3}, LL/h;->a(LW0/c;ZJ)F

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    invoke-virtual {p1, v1}, LB0/N;->u(F)F

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    :goto_1
    iget-object v2, p0, LL/a;->r:LL/s;

    .line 83
    .line 84
    invoke-virtual {v2, p1, v1, v7, v8}, LL/s;->c(LB0/N;FJ)V

    .line 85
    .line 86
    .line 87
    iget-object p1, v0, Ll0/b;->r:LB0/G0;

    .line 88
    .line 89
    invoke-virtual {p1}, LB0/G0;->t()Lj0/m;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object v1, p0, LL/a;->z:LP/f0;

    .line 94
    .line 95
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Ljava/lang/Boolean;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 102
    .line 103
    .line 104
    iget-object v1, p0, LL/a;->y:LP/f0;

    .line 105
    .line 106
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    move-object v3, v1

    .line 111
    check-cast v3, LL/k;

    .line 112
    .line 113
    if-eqz v3, :cond_2

    .line 114
    .line 115
    invoke-interface {v0}, Ll0/d;->d()J

    .line 116
    .line 117
    .line 118
    move-result-wide v4

    .line 119
    iget v6, p0, LL/a;->B:I

    .line 120
    .line 121
    invoke-virtual/range {v3 .. v9}, LL/k;->e(JIJF)V

    .line 122
    .line 123
    .line 124
    invoke-static {p1}, Lj0/c;->a(Lj0/m;)Landroid/graphics/Canvas;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {v3, p1}, LL/k;->draw(Landroid/graphics/Canvas;)V

    .line 129
    .line 130
    .line 131
    :cond_2
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    return-void
.end method

.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, LL/a;->x:LL/i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, LL/a;->Y()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LL/i;->t:LB0/o;

    .line 9
    .line 10
    iget-object v2, v1, LB0/o;->q:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v2, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, LL/k;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, LL/k;->c()V

    .line 23
    .line 24
    .line 25
    iget-object v3, v1, LB0/o;->q:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-virtual {v3, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, LL/k;

    .line 34
    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    iget-object v1, v1, LB0/o;->r:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-interface {v1, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, LL/j;

    .line 46
    .line 47
    :cond_0
    invoke-interface {v3, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object v0, v0, LL/i;->s:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method

.method public final e()V
    .locals 5

    .line 1
    iget-object v0, p0, LL/a;->x:LL/i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, LL/a;->Y()V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, LL/i;->t:LB0/o;

    .line 9
    .line 10
    iget-object v2, v1, LB0/o;->q:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v2, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, LL/k;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {v2}, LL/k;->c()V

    .line 23
    .line 24
    .line 25
    iget-object v3, v1, LB0/o;->q:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 28
    .line 29
    invoke-virtual {v3, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, LL/k;

    .line 34
    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    iget-object v1, v1, LB0/o;->r:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    invoke-interface {v1, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, LL/j;

    .line 46
    .line 47
    :cond_0
    invoke-interface {v3, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget-object v0, v0, LL/i;->s:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method
