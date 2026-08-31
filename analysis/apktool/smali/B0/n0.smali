.class public abstract LB0/n0;
.super LB0/T;
.source "SourceFile"

# interfaces
.implements Lz0/B;
.implements Lz0/m;
.implements LB0/u0;


# static fields
.field public static final W:Lj0/C;

.field public static final X:LB0/x;

.field public static final Y:LB0/e;

.field public static final Z:LB0/e;


# instance fields
.field public final B:LB0/L;

.field public C:LB0/n0;

.field public D:LB0/n0;

.field public E:Z

.field public F:Z

.field public G:LB5/c;

.field public H:LW0/c;

.field public I:LW0/l;

.field public J:F

.field public K:Lz0/D;

.field public L:Lr/B;

.field public M:J

.field public N:F

.field public O:Li0/a;

.field public P:LB0/x;

.field public Q:Lm0/c;

.field public R:Lj0/m;

.field public S:LB0/j0;

.field public final T:LB0/k0;

.field public U:Z

.field public V:LB0/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lj0/C;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    iput v1, v0, Lj0/C;->r:F

    .line 9
    .line 10
    iput v1, v0, Lj0/C;->s:F

    .line 11
    .line 12
    iput v1, v0, Lj0/C;->t:F

    .line 13
    .line 14
    sget-wide v1, Lj0/u;->a:J

    .line 15
    .line 16
    iput-wide v1, v0, Lj0/C;->v:J

    .line 17
    .line 18
    iput-wide v1, v0, Lj0/C;->w:J

    .line 19
    .line 20
    const/high16 v1, 0x41000000    # 8.0f

    .line 21
    .line 22
    iput v1, v0, Lj0/C;->x:F

    .line 23
    .line 24
    sget-wide v1, Lj0/H;->b:J

    .line 25
    .line 26
    iput-wide v1, v0, Lj0/C;->y:J

    .line 27
    .line 28
    sget-object v1, Lj0/B;->a:LO3/D;

    .line 29
    .line 30
    iput-object v1, v0, Lj0/C;->z:Lj0/E;

    .line 31
    .line 32
    const-wide v1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    iput-wide v1, v0, Lj0/C;->B:J

    .line 38
    .line 39
    invoke-static {}, Lcom/google/android/gms/internal/measurement/I1;->B()LW0/d;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, v0, Lj0/C;->C:LW0/c;

    .line 44
    .line 45
    sget-object v1, LW0/l;->q:LW0/l;

    .line 46
    .line 47
    iput-object v1, v0, Lj0/C;->D:LW0/l;

    .line 48
    .line 49
    sput-object v0, LB0/n0;->W:Lj0/C;

    .line 50
    .line 51
    new-instance v0, LB0/x;

    .line 52
    .line 53
    invoke-direct {v0}, LB0/x;-><init>()V

    .line 54
    .line 55
    .line 56
    sput-object v0, LB0/n0;->X:LB0/x;

    .line 57
    .line 58
    new-instance v0, LB0/e;

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    invoke-direct {v0, v1}, LB0/e;-><init>(I)V

    .line 62
    .line 63
    .line 64
    sput-object v0, LB0/n0;->Y:LB0/e;

    .line 65
    .line 66
    new-instance v0, LB0/e;

    .line 67
    .line 68
    const/4 v1, 0x2

    .line 69
    invoke-direct {v0, v1}, LB0/e;-><init>(I)V

    .line 70
    .line 71
    .line 72
    sput-object v0, LB0/n0;->Z:LB0/e;

    .line 73
    .line 74
    return-void
.end method

.method public constructor <init>(LB0/L;)V
    .locals 2

    .line 1
    invoke-direct {p0}, LB0/T;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LB0/n0;->B:LB0/L;

    .line 5
    .line 6
    iget-object v0, p1, LB0/L;->N:LW0/c;

    .line 7
    .line 8
    iput-object v0, p0, LB0/n0;->H:LW0/c;

    .line 9
    .line 10
    iget-object p1, p1, LB0/L;->O:LW0/l;

    .line 11
    .line 12
    iput-object p1, p0, LB0/n0;->I:LW0/l;

    .line 13
    .line 14
    const p1, 0x3f4ccccd    # 0.8f

    .line 15
    .line 16
    .line 17
    iput p1, p0, LB0/n0;->J:F

    .line 18
    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    iput-wide v0, p0, LB0/n0;->M:J

    .line 22
    .line 23
    new-instance p1, LB0/k0;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p1, p0, v0}, LB0/k0;-><init>(LB0/n0;I)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, LB0/n0;->T:LB0/k0;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final A0()J
    .locals 3

    .line 1
    iget-object v0, p0, LB0/n0;->H:LW0/c;

    .line 2
    .line 3
    iget-object v1, p0, LB0/n0;->B:LB0/L;

    .line 4
    .line 5
    iget-object v1, v1, LB0/L;->P:LC0/b1;

    .line 6
    .line 7
    invoke-interface {v1}, LC0/b1;->d()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-interface {v0, v1, v2}, LW0/c;->Q(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
.end method

.method public abstract B0()Lc0/l;
.end method

.method public final C()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LB0/n0;->B0()Lc0/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lc0/l;->D:Z

    .line 6
    .line 7
    return v0
.end method

.method public final C0(I)Lc0/l;
    .locals 3

    .line 1
    invoke-static {p1}, LB0/o0;->g(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LB0/n0;->B0()Lc0/l;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v1, Lc0/l;->u:Lc0/l;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, LB0/n0;->D0(Z)Lc0/l;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_1
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget v2, v0, Lc0/l;->t:I

    .line 24
    .line 25
    and-int/2addr v2, p1

    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    iget v2, v0, Lc0/l;->s:I

    .line 29
    .line 30
    and-int/2addr v2, p1

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_2
    if-eq v0, v1, :cond_3

    .line 35
    .line 36
    iget-object v0, v0, Lc0/l;->v:Lc0/l;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    :goto_2
    const/4 p1, 0x0

    .line 40
    return-object p1
.end method

.method public final D0(Z)Lc0/l;
    .locals 2

    .line 1
    iget-object v0, p0, LB0/n0;->B:LB0/L;

    .line 2
    .line 3
    iget-object v0, v0, LB0/L;->U:LB0/g0;

    .line 4
    .line 5
    iget-object v1, v0, LB0/g0;->c:LB0/n0;

    .line 6
    .line 7
    if-ne v1, p0, :cond_0

    .line 8
    .line 9
    iget-object p1, v0, LB0/g0;->e:Lc0/l;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    iget-object p1, p0, LB0/n0;->D:LB0/n0;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, LB0/n0;->B0()Lc0/l;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p1, Lc0/l;->v:Lc0/l;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    return-object v0

    .line 29
    :cond_2
    iget-object p1, p0, LB0/n0;->D:LB0/n0;

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    invoke-virtual {p1}, LB0/n0;->B0()Lc0/l;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_3
    return-object v0
.end method

.method public final E()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lz0/J;->s:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final E0(Lc0/l;LB0/e;JLB0/t;IZ)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object v4, p5

    .line 7
    move v5, p6

    .line 8
    move v6, p7

    .line 9
    invoke-virtual/range {v0 .. v6}, LB0/n0;->H0(LB0/e;JLB0/t;IZ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    move-object v1, p2

    .line 14
    move-wide v2, p3

    .line 15
    move-object v4, p5

    .line 16
    move v5, p6

    .line 17
    move v6, p7

    .line 18
    iget p2, v4, LB0/t;->s:I

    .line 19
    .line 20
    iget-object p3, v4, LB0/t;->q:Lr/C;

    .line 21
    .line 22
    add-int/lit8 p4, p2, 0x1

    .line 23
    .line 24
    iget p5, p3, Lr/C;->b:I

    .line 25
    .line 26
    invoke-virtual {v4, p4, p5}, LB0/t;->g(II)V

    .line 27
    .line 28
    .line 29
    iget p4, v4, LB0/t;->s:I

    .line 30
    .line 31
    add-int/lit8 p4, p4, 0x1

    .line 32
    .line 33
    iput p4, v4, LB0/t;->s:I

    .line 34
    .line 35
    invoke-virtual {p3, p1}, Lr/C;->a(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p3, v4, LB0/t;->r:Lr/x;

    .line 39
    .line 40
    const/high16 p4, -0x40800000    # -1.0f

    .line 41
    .line 42
    const/4 p5, 0x0

    .line 43
    invoke-static {p4, v6, p5}, LB0/g;->a(FZZ)J

    .line 44
    .line 45
    .line 46
    move-result-wide p4

    .line 47
    invoke-virtual {p3, p4, p5}, Lr/x;->a(J)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, LB0/e;->b()I

    .line 51
    .line 52
    .line 53
    move-result p3

    .line 54
    invoke-static {p1, p3}, LB0/g;->e(LB0/m;I)Lc0/l;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    move-object v0, p0

    .line 59
    move v7, v6

    .line 60
    move v6, v5

    .line 61
    move-object v5, v4

    .line 62
    move-wide v3, v2

    .line 63
    move-object v2, v1

    .line 64
    move-object v1, p1

    .line 65
    invoke-virtual/range {v0 .. v7}, LB0/n0;->E0(Lc0/l;LB0/e;JLB0/t;IZ)V

    .line 66
    .line 67
    .line 68
    move-object v4, v5

    .line 69
    iput p2, v4, LB0/t;->s:I

    .line 70
    .line 71
    return-void
.end method

.method public final F(J)J
    .locals 3

    .line 1
    invoke-virtual {p0}, LB0/n0;->B0()Lc0/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lc0/l;->D:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, LB0/n0;->M0()V

    .line 15
    .line 16
    .line 17
    move-object v0, p0

    .line 18
    :goto_0
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-object v1, v0, LB0/n0;->V:LB0/s0;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-interface {v1, v2, p1, p2}, LB0/s0;->f(ZJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    :cond_1
    iget-wide v1, v0, LB0/n0;->M:J

    .line 30
    .line 31
    invoke-static {p1, p2, v1, v2}, Lcom/google/android/gms/internal/measurement/K1;->H(JJ)J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    iget-object v0, v0, LB0/n0;->D:LB0/n0;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    return-wide p1
.end method

.method public final F0(Lc0/l;LB0/e;JLB0/t;IZF)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object/from16 v4, p5

    .line 7
    .line 8
    move/from16 v5, p6

    .line 9
    .line 10
    move/from16 v6, p7

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v6}, LB0/n0;->H0(LB0/e;JLB0/t;IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    move-object/from16 v4, p5

    .line 17
    .line 18
    iget v10, v4, LB0/t;->s:I

    .line 19
    .line 20
    iget-object v0, v4, LB0/t;->q:Lr/C;

    .line 21
    .line 22
    add-int/lit8 v1, v10, 0x1

    .line 23
    .line 24
    iget v2, v0, Lr/C;->b:I

    .line 25
    .line 26
    invoke-virtual {v4, v1, v2}, LB0/t;->g(II)V

    .line 27
    .line 28
    .line 29
    iget v1, v4, LB0/t;->s:I

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    iput v1, v4, LB0/t;->s:I

    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lr/C;->a(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, v4, LB0/t;->r:Lr/x;

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    move/from16 v7, p7

    .line 42
    .line 43
    move/from16 v8, p8

    .line 44
    .line 45
    invoke-static {v8, v7, v1}, LB0/g;->a(FZZ)J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    invoke-virtual {v0, v1, v2}, Lr/x;->a(J)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, LB0/e;->b()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {p1, v0}, LB0/g;->e(LB0/m;I)Lc0/l;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const/4 v9, 0x1

    .line 61
    move-object v0, p0

    .line 62
    move-object v2, p2

    .line 63
    move/from16 v6, p6

    .line 64
    .line 65
    move-object v5, v4

    .line 66
    move-wide v3, p3

    .line 67
    invoke-virtual/range {v0 .. v9}, LB0/n0;->P0(Lc0/l;LB0/e;JLB0/t;IZFZ)V

    .line 68
    .line 69
    .line 70
    move-object v4, v5

    .line 71
    iput v10, v4, LB0/t;->s:I

    .line 72
    .line 73
    return-void
.end method

.method public final G0(LB0/e;JLB0/t;IZ)V
    .locals 14

    .line 1
    move-wide/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    move/from16 v6, p5

    .line 6
    .line 7
    invoke-virtual {p1}, LB0/e;->b()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, v0}, LB0/n0;->C0(I)Lc0/l;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v3, v4}, LB0/n0;->W0(J)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/high16 v9, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 21
    .line 22
    const v10, 0x7fffffff

    .line 23
    .line 24
    .line 25
    const/4 v11, 0x1

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    if-ne v6, v11, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, LB0/n0;->A0()J

    .line 31
    .line 32
    .line 33
    move-result-wide v11

    .line 34
    invoke-virtual {p0, v3, v4, v11, v12}, LB0/n0;->s0(JJ)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    and-int/2addr v2, v10

    .line 43
    if-ge v2, v9, :cond_1

    .line 44
    .line 45
    iget v2, v5, LB0/t;->s:I

    .line 46
    .line 47
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/n2;->u(Ljava/util/List;)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-ne v2, v7, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {v0, v8, v8}, LB0/g;->a(FZZ)J

    .line 55
    .line 56
    .line 57
    move-result-wide v7

    .line 58
    invoke-virtual {v5}, LB0/t;->d()J

    .line 59
    .line 60
    .line 61
    move-result-wide v9

    .line 62
    invoke-static {v9, v10, v7, v8}, LB0/g;->h(JJ)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-lez v2, :cond_1

    .line 67
    .line 68
    :goto_0
    const/4 v7, 0x0

    .line 69
    move-object v2, p1

    .line 70
    move v8, v0

    .line 71
    move-object v0, p0

    .line 72
    invoke-virtual/range {v0 .. v8}, LB0/n0;->F0(Lc0/l;LB0/e;JLB0/t;IZF)V

    .line 73
    .line 74
    .line 75
    :cond_1
    return-void

    .line 76
    :cond_2
    if-nez v1, :cond_3

    .line 77
    .line 78
    invoke-virtual/range {p0 .. p6}, LB0/n0;->H0(LB0/e;JLB0/t;IZ)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_3
    const/16 v0, 0x20

    .line 83
    .line 84
    shr-long v2, p2, v0

    .line 85
    .line 86
    long-to-int v0, v2

    .line 87
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    const-wide v2, 0xffffffffL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    and-long v2, p2, v2

    .line 97
    .line 98
    long-to-int v2, v2

    .line 99
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    const/4 v3, 0x0

    .line 104
    cmpl-float v4, v0, v3

    .line 105
    .line 106
    if-ltz v4, :cond_4

    .line 107
    .line 108
    cmpl-float v3, v2, v3

    .line 109
    .line 110
    if-ltz v3, :cond_4

    .line 111
    .line 112
    invoke-virtual {p0}, Lz0/J;->N()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    int-to-float v3, v3

    .line 117
    cmpg-float v0, v0, v3

    .line 118
    .line 119
    if-gez v0, :cond_4

    .line 120
    .line 121
    invoke-virtual {p0}, Lz0/J;->K()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    int-to-float v0, v0

    .line 126
    cmpg-float v0, v2, v0

    .line 127
    .line 128
    if-gez v0, :cond_4

    .line 129
    .line 130
    move-object v0, p0

    .line 131
    move-object v2, p1

    .line 132
    move-wide/from16 v3, p2

    .line 133
    .line 134
    move-object/from16 v5, p4

    .line 135
    .line 136
    move/from16 v6, p5

    .line 137
    .line 138
    move/from16 v7, p6

    .line 139
    .line 140
    invoke-virtual/range {v0 .. v7}, LB0/n0;->E0(Lc0/l;LB0/e;JLB0/t;IZ)V

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :cond_4
    move-wide/from16 v3, p2

    .line 145
    .line 146
    move-object/from16 v5, p4

    .line 147
    .line 148
    move/from16 v6, p5

    .line 149
    .line 150
    if-ne v6, v11, :cond_5

    .line 151
    .line 152
    invoke-virtual {p0}, LB0/n0;->A0()J

    .line 153
    .line 154
    .line 155
    move-result-wide v12

    .line 156
    invoke-virtual {p0, v3, v4, v12, v13}, LB0/n0;->s0(JJ)F

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    goto :goto_1

    .line 161
    :cond_5
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 162
    .line 163
    :goto_1
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    and-int/2addr v7, v10

    .line 168
    if-ge v7, v9, :cond_7

    .line 169
    .line 170
    iget v7, v5, LB0/t;->s:I

    .line 171
    .line 172
    invoke-static {v5}, Lcom/google/android/gms/internal/measurement/n2;->u(Ljava/util/List;)I

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    if-ne v7, v9, :cond_6

    .line 177
    .line 178
    move/from16 v7, p6

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_6
    move/from16 v7, p6

    .line 182
    .line 183
    invoke-static {v2, v7, v8}, LB0/g;->a(FZZ)J

    .line 184
    .line 185
    .line 186
    move-result-wide v9

    .line 187
    invoke-virtual {v5}, LB0/t;->d()J

    .line 188
    .line 189
    .line 190
    move-result-wide v12

    .line 191
    invoke-static {v12, v13, v9, v10}, LB0/g;->h(JJ)I

    .line 192
    .line 193
    .line 194
    move-result v9

    .line 195
    if-lez v9, :cond_8

    .line 196
    .line 197
    :goto_2
    move v9, v11

    .line 198
    :goto_3
    move-object v0, p0

    .line 199
    move v8, v2

    .line 200
    move-object v2, p1

    .line 201
    goto :goto_4

    .line 202
    :cond_7
    move/from16 v7, p6

    .line 203
    .line 204
    :cond_8
    move v9, v8

    .line 205
    goto :goto_3

    .line 206
    :goto_4
    invoke-virtual/range {v0 .. v9}, LB0/n0;->P0(Lc0/l;LB0/e;JLB0/t;IZFZ)V

    .line 207
    .line 208
    .line 209
    return-void
.end method

.method public H0(LB0/e;JLB0/t;IZ)V
    .locals 7

    .line 1
    iget-object v0, p0, LB0/n0;->C:LB0/n0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p2, p3}, LB0/n0;->x0(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    move-object v1, p1

    .line 10
    move-object v4, p4

    .line 11
    move v5, p5

    .line 12
    move v6, p6

    .line 13
    invoke-virtual/range {v0 .. v6}, LB0/n0;->G0(LB0/e;JLB0/t;IZ)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final I(Lz0/m;Z)Li0/c;
    .locals 7

    .line 1
    invoke-virtual {p0}, LB0/n0;->B0()Lc0/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lc0/l;->D:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-interface {p1}, Lz0/m;->C()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "LayoutCoordinates "

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, " is not attached!"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    instance-of v0, p1, Lz0/A;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    move-object v0, p1

    .line 47
    check-cast v0, Lz0/A;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v0, 0x0

    .line 51
    :goto_0
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v0, v0, Lz0/A;->q:LB0/U;

    .line 54
    .line 55
    iget-object v0, v0, LB0/U;->B:LB0/n0;

    .line 56
    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    :cond_3
    move-object v0, p1

    .line 60
    check-cast v0, LB0/n0;

    .line 61
    .line 62
    :cond_4
    invoke-virtual {v0}, LB0/n0;->M0()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, LB0/n0;->w0(LB0/n0;)LB0/n0;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v2, p0, LB0/n0;->O:Li0/a;

    .line 70
    .line 71
    if-nez v2, :cond_5

    .line 72
    .line 73
    new-instance v2, Li0/a;

    .line 74
    .line 75
    invoke-direct {v2}, Li0/a;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v2, p0, LB0/n0;->O:Li0/a;

    .line 79
    .line 80
    :cond_5
    const/4 v3, 0x0

    .line 81
    iput v3, v2, Li0/a;->b:F

    .line 82
    .line 83
    iput v3, v2, Li0/a;->c:F

    .line 84
    .line 85
    invoke-interface {p1}, Lz0/m;->E()J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    const/16 v5, 0x20

    .line 90
    .line 91
    shr-long/2addr v3, v5

    .line 92
    long-to-int v3, v3

    .line 93
    int-to-float v3, v3

    .line 94
    iput v3, v2, Li0/a;->d:F

    .line 95
    .line 96
    invoke-interface {p1}, Lz0/m;->E()J

    .line 97
    .line 98
    .line 99
    move-result-wide v3

    .line 100
    const-wide v5, 0xffffffffL

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    and-long/2addr v3, v5

    .line 106
    long-to-int p1, v3

    .line 107
    int-to-float p1, p1

    .line 108
    iput p1, v2, Li0/a;->e:F

    .line 109
    .line 110
    :goto_1
    if-eq v0, v1, :cond_7

    .line 111
    .line 112
    const/4 p1, 0x0

    .line 113
    invoke-virtual {v0, v2, p2, p1}, LB0/n0;->S0(Li0/a;ZZ)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Li0/a;->b()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_6

    .line 121
    .line 122
    sget-object p1, Li0/c;->e:Li0/c;

    .line 123
    .line 124
    return-object p1

    .line 125
    :cond_6
    iget-object v0, v0, LB0/n0;->D:LB0/n0;

    .line 126
    .line 127
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_7
    invoke-virtual {p0, v1, v2, p2}, LB0/n0;->p0(LB0/n0;Li0/a;Z)V

    .line 132
    .line 133
    .line 134
    new-instance p1, Li0/c;

    .line 135
    .line 136
    iget p2, v2, Li0/a;->b:F

    .line 137
    .line 138
    iget v0, v2, Li0/a;->c:F

    .line 139
    .line 140
    iget v1, v2, Li0/a;->d:F

    .line 141
    .line 142
    iget v2, v2, Li0/a;->e:F

    .line 143
    .line 144
    invoke-direct {p1, p2, v0, v1, v2}, Li0/c;-><init>(FFFF)V

    .line 145
    .line 146
    .line 147
    return-object p1
.end method

.method public final I0()V
    .locals 1

    .line 1
    iget-object v0, p0, LB0/n0;->V:LB0/s0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LB0/s0;->invalidate()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, LB0/n0;->D:LB0/n0;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, LB0/n0;->I0()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final J0()Z
    .locals 2

    .line 1
    iget-object v0, p0, LB0/n0;->V:LB0/s0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, LB0/n0;->J:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, LB0/n0;->D:LB0/n0;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, LB0/n0;->J0()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    return v0

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    return v0
.end method

.method public final K0(Lz0/m;J)J
    .locals 3

    .line 1
    instance-of v0, p1, Lz0/A;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lz0/A;

    .line 7
    .line 8
    iget-object v0, v0, Lz0/A;->q:LB0/U;

    .line 9
    .line 10
    iget-object v0, v0, LB0/U;->B:LB0/n0;

    .line 11
    .line 12
    invoke-virtual {v0}, LB0/n0;->M0()V

    .line 13
    .line 14
    .line 15
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    xor-long/2addr p2, v0

    .line 21
    check-cast p1, Lz0/A;

    .line 22
    .line 23
    invoke-virtual {p1, p0, p2, p3}, Lz0/A;->a(Lz0/m;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    xor-long/2addr p1, v0

    .line 28
    return-wide p1

    .line 29
    :cond_0
    if-eqz v0, :cond_1

    .line 30
    .line 31
    move-object v0, p1

    .line 32
    check-cast v0, Lz0/A;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    :goto_0
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-object v0, v0, Lz0/A;->q:LB0/U;

    .line 39
    .line 40
    iget-object v0, v0, LB0/U;->B:LB0/n0;

    .line 41
    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    :cond_2
    const-string v0, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator"

    .line 45
    .line 46
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    move-object v0, p1

    .line 50
    check-cast v0, LB0/n0;

    .line 51
    .line 52
    :cond_3
    invoke-virtual {v0}, LB0/n0;->M0()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0}, LB0/n0;->w0(LB0/n0;)LB0/n0;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :goto_1
    if-eq v0, p1, :cond_5

    .line 60
    .line 61
    iget-object v1, v0, LB0/n0;->V:LB0/s0;

    .line 62
    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-interface {v1, v2, p2, p3}, LB0/s0;->f(ZJ)J

    .line 67
    .line 68
    .line 69
    move-result-wide p2

    .line 70
    :cond_4
    iget-wide v1, v0, LB0/n0;->M:J

    .line 71
    .line 72
    invoke-static {p2, p3, v1, v2}, Lcom/google/android/gms/internal/measurement/K1;->H(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide p2

    .line 76
    iget-object v0, v0, LB0/n0;->D:LB0/n0;

    .line 77
    .line 78
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    invoke-virtual {p0, p1, p2, p3}, LB0/n0;->q0(LB0/n0;J)J

    .line 83
    .line 84
    .line 85
    move-result-wide p1

    .line 86
    return-wide p1
.end method

.method public final L0()V
    .locals 5

    .line 1
    iget-object v0, p0, LB0/n0;->V:LB0/s0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LB0/n0;->G:LB5/c;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LB0/n0;->B:LB0/L;

    .line 10
    .line 11
    invoke-static {v0}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, LB0/n0;->y0()LB5/e;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    const/16 v3, 0x8

    .line 21
    .line 22
    iget-object v4, p0, LB0/n0;->T:LB0/k0;

    .line 23
    .line 24
    invoke-static {v0, v1, v4, v2, v3}, LB0/t0;->d(LB0/t0;LB5/e;LB0/k0;ZI)LB0/s0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-wide v1, p0, Lz0/J;->s:J

    .line 29
    .line 30
    invoke-interface {v0, v1, v2}, LB0/s0;->a(J)V

    .line 31
    .line 32
    .line 33
    iget-wide v1, p0, LB0/n0;->M:J

    .line 34
    .line 35
    invoke-interface {v0, v1, v2}, LB0/s0;->d(J)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0}, LB0/s0;->invalidate()V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, LB0/n0;->V:LB0/s0;

    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public final M0()V
    .locals 5

    .line 1
    iget-object v0, p0, LB0/n0;->B:LB0/L;

    .line 2
    .line 3
    iget-object v0, v0, LB0/L;->V:LB0/P;

    .line 4
    .line 5
    iget-object v1, v0, LB0/P;->a:LB0/L;

    .line 6
    .line 7
    iget-object v1, v1, LB0/L;->V:LB0/P;

    .line 8
    .line 9
    iget-object v1, v1, LB0/P;->d:LB0/G;

    .line 10
    .line 11
    sget-object v2, LB0/G;->s:LB0/G;

    .line 12
    .line 13
    sget-object v3, LB0/G;->t:LB0/G;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    if-ne v1, v3, :cond_2

    .line 19
    .line 20
    :cond_0
    iget-object v2, v0, LB0/P;->p:LB0/c0;

    .line 21
    .line 22
    iget-boolean v2, v2, LB0/c0;->P:Z

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0, v4}, LB0/P;->e(Z)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {v0, v4}, LB0/P;->d(Z)V

    .line 31
    .line 32
    .line 33
    :cond_2
    :goto_0
    if-ne v1, v3, :cond_4

    .line 34
    .line 35
    iget-object v1, v0, LB0/P;->q:LB0/Y;

    .line 36
    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    iget-boolean v1, v1, LB0/Y;->J:Z

    .line 40
    .line 41
    if-ne v1, v4, :cond_3

    .line 42
    .line 43
    invoke-virtual {v0, v4}, LB0/P;->g(Z)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    invoke-virtual {v0, v4}, LB0/P;->f(Z)V

    .line 48
    .line 49
    .line 50
    :cond_4
    return-void
.end method

.method public final N0()V
    .locals 13

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, LB0/o0;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, LB0/n0;->D0(Z)Lc0/l;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_c

    .line 12
    .line 13
    iget-object v2, v2, Lc0/l;->q:Lc0/l;

    .line 14
    .line 15
    iget v2, v2, Lc0/l;->t:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_c

    .line 19
    .line 20
    invoke-static {}, La0/r;->c()La0/h;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2}, La0/h;->e()LB5/c;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v4, v3

    .line 33
    :goto_0
    invoke-static {v2}, La0/r;->d(La0/h;)La0/h;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {p0}, LB0/n0;->B0()Lc0/l;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0}, LB0/n0;->B0()Lc0/l;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iget-object v6, v6, Lc0/l;->u:Lc0/l;

    .line 52
    .line 53
    if-nez v6, :cond_2

    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_2
    :goto_1
    invoke-virtual {p0, v1}, LB0/n0;->D0(Z)Lc0/l;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_2
    if-eqz v1, :cond_b

    .line 62
    .line 63
    iget v7, v1, Lc0/l;->t:I

    .line 64
    .line 65
    and-int/2addr v7, v0

    .line 66
    if-eqz v7, :cond_b

    .line 67
    .line 68
    iget v7, v1, Lc0/l;->s:I

    .line 69
    .line 70
    and-int/2addr v7, v0

    .line 71
    if-eqz v7, :cond_a

    .line 72
    .line 73
    move-object v7, v1

    .line 74
    move-object v8, v3

    .line 75
    :goto_3
    if-eqz v7, :cond_a

    .line 76
    .line 77
    instance-of v9, v7, LB0/y;

    .line 78
    .line 79
    if-eqz v9, :cond_3

    .line 80
    .line 81
    check-cast v7, LB0/y;

    .line 82
    .line 83
    iget-wide v9, p0, Lz0/J;->s:J

    .line 84
    .line 85
    invoke-interface {v7, v9, v10}, LB0/y;->q(J)V

    .line 86
    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_3
    iget v9, v7, Lc0/l;->s:I

    .line 90
    .line 91
    and-int/2addr v9, v0

    .line 92
    if-eqz v9, :cond_9

    .line 93
    .line 94
    instance-of v9, v7, LB0/n;

    .line 95
    .line 96
    if-eqz v9, :cond_9

    .line 97
    .line 98
    move-object v9, v7

    .line 99
    check-cast v9, LB0/n;

    .line 100
    .line 101
    iget-object v9, v9, LB0/n;->F:Lc0/l;

    .line 102
    .line 103
    const/4 v10, 0x0

    .line 104
    :goto_4
    const/4 v11, 0x1

    .line 105
    if-eqz v9, :cond_8

    .line 106
    .line 107
    iget v12, v9, Lc0/l;->s:I

    .line 108
    .line 109
    and-int/2addr v12, v0

    .line 110
    if-eqz v12, :cond_7

    .line 111
    .line 112
    add-int/lit8 v10, v10, 0x1

    .line 113
    .line 114
    if-ne v10, v11, :cond_4

    .line 115
    .line 116
    move-object v7, v9

    .line 117
    goto :goto_5

    .line 118
    :cond_4
    if-nez v8, :cond_5

    .line 119
    .line 120
    new-instance v8, LR/e;

    .line 121
    .line 122
    const/16 v11, 0x10

    .line 123
    .line 124
    new-array v11, v11, [Lc0/l;

    .line 125
    .line 126
    invoke-direct {v8, v11}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    if-eqz v7, :cond_6

    .line 130
    .line 131
    invoke-virtual {v8, v7}, LR/e;->c(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object v7, v3

    .line 135
    :cond_6
    invoke-virtual {v8, v9}, LR/e;->c(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_7
    :goto_5
    iget-object v9, v9, Lc0/l;->v:Lc0/l;

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_8
    if-ne v10, v11, :cond_9

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_9
    :goto_6
    invoke-static {v8}, LB0/g;->f(LR/e;)Lc0/l;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    goto :goto_3

    .line 149
    :cond_a
    if-eq v1, v6, :cond_b

    .line 150
    .line 151
    iget-object v1, v1, Lc0/l;->v:Lc0/l;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_b
    :goto_7
    invoke-static {v2, v5, v4}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_8
    invoke-static {v2, v5, v4}, La0/r;->f(La0/h;La0/h;LB5/c;)V

    .line 159
    .line 160
    .line 161
    throw v0

    .line 162
    :cond_c
    return-void
.end method

.method public final O0()V
    .locals 10

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, LB0/o0;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, LB0/n0;->B0()Lc0/l;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v2, v2, Lc0/l;->u:Lc0/l;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    goto/16 :goto_6

    .line 19
    .line 20
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, LB0/n0;->D0(Z)Lc0/l;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_1
    if-eqz v1, :cond_a

    .line 25
    .line 26
    iget v3, v1, Lc0/l;->t:I

    .line 27
    .line 28
    and-int/2addr v3, v0

    .line 29
    if-eqz v3, :cond_a

    .line 30
    .line 31
    iget v3, v1, Lc0/l;->s:I

    .line 32
    .line 33
    and-int/2addr v3, v0

    .line 34
    if-eqz v3, :cond_9

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    move-object v4, v1

    .line 38
    move-object v5, v3

    .line 39
    :goto_2
    if-eqz v4, :cond_9

    .line 40
    .line 41
    instance-of v6, v4, LB0/y;

    .line 42
    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    check-cast v4, LB0/y;

    .line 46
    .line 47
    invoke-interface {v4, p0}, LB0/y;->j0(Lz0/m;)V

    .line 48
    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_2
    iget v6, v4, Lc0/l;->s:I

    .line 52
    .line 53
    and-int/2addr v6, v0

    .line 54
    if-eqz v6, :cond_8

    .line 55
    .line 56
    instance-of v6, v4, LB0/n;

    .line 57
    .line 58
    if-eqz v6, :cond_8

    .line 59
    .line 60
    move-object v6, v4

    .line 61
    check-cast v6, LB0/n;

    .line 62
    .line 63
    iget-object v6, v6, LB0/n;->F:Lc0/l;

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    :goto_3
    const/4 v8, 0x1

    .line 67
    if-eqz v6, :cond_7

    .line 68
    .line 69
    iget v9, v6, Lc0/l;->s:I

    .line 70
    .line 71
    and-int/2addr v9, v0

    .line 72
    if-eqz v9, :cond_6

    .line 73
    .line 74
    add-int/lit8 v7, v7, 0x1

    .line 75
    .line 76
    if-ne v7, v8, :cond_3

    .line 77
    .line 78
    move-object v4, v6

    .line 79
    goto :goto_4

    .line 80
    :cond_3
    if-nez v5, :cond_4

    .line 81
    .line 82
    new-instance v5, LR/e;

    .line 83
    .line 84
    const/16 v8, 0x10

    .line 85
    .line 86
    new-array v8, v8, [Lc0/l;

    .line 87
    .line 88
    invoke-direct {v5, v8}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    if-eqz v4, :cond_5

    .line 92
    .line 93
    invoke-virtual {v5, v4}, LR/e;->c(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    move-object v4, v3

    .line 97
    :cond_5
    invoke-virtual {v5, v6}, LR/e;->c(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_6
    :goto_4
    iget-object v6, v6, Lc0/l;->v:Lc0/l;

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_7
    if-ne v7, v8, :cond_8

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_8
    :goto_5
    invoke-static {v5}, LB0/g;->f(LR/e;)Lc0/l;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    goto :goto_2

    .line 111
    :cond_9
    if-eq v1, v2, :cond_a

    .line 112
    .line 113
    iget-object v1, v1, Lc0/l;->v:Lc0/l;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_a
    :goto_6
    return-void
.end method

.method public final P0(Lc0/l;LB0/e;JLB0/t;IZFZ)V
    .locals 17

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object/from16 v0, p0

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    move-wide/from16 v2, p3

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    move/from16 v5, p6

    .line 12
    .line 13
    move/from16 v6, p7

    .line 14
    .line 15
    invoke-virtual/range {v0 .. v6}, LB0/n0;->H0(LB0/e;JLB0/t;IZ)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    move/from16 v6, p6

    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v11, 0x1

    .line 26
    const/4 v3, 0x3

    .line 27
    if-ne v6, v3, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v4, 0x4

    .line 31
    if-ne v6, v4, :cond_11

    .line 32
    .line 33
    :goto_0
    move-object/from16 v4, p1

    .line 34
    .line 35
    move-object v5, v2

    .line 36
    :goto_1
    if-eqz v4, :cond_11

    .line 37
    .line 38
    instance-of v7, v4, LB0/y0;

    .line 39
    .line 40
    if-eqz v7, :cond_a

    .line 41
    .line 42
    check-cast v4, LB0/y0;

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    sget v4, LB0/C0;->b:I

    .line 48
    .line 49
    sget-wide v4, LB0/C0;->a:J

    .line 50
    .line 51
    const/16 v7, 0x20

    .line 52
    .line 53
    shr-long v7, p3, v7

    .line 54
    .line 55
    long-to-int v7, v7

    .line 56
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    move-object/from16 v9, p0

    .line 61
    .line 62
    iget-object v10, v9, LB0/n0;->B:LB0/L;

    .line 63
    .line 64
    iget-object v12, v10, LB0/L;->O:LW0/l;

    .line 65
    .line 66
    sget v13, LB0/C0;->b:I

    .line 67
    .line 68
    const-wide/high16 v13, -0x8000000000000000L

    .line 69
    .line 70
    and-long/2addr v13, v4

    .line 71
    const-wide/16 v15, 0x0

    .line 72
    .line 73
    cmp-long v13, v13, v15

    .line 74
    .line 75
    sget-object v14, LW0/l;->q:LW0/l;

    .line 76
    .line 77
    const/4 v15, 0x2

    .line 78
    if-eqz v13, :cond_3

    .line 79
    .line 80
    if-ne v12, v14, :cond_2

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    invoke-static {v15, v4, v5}, LB0/e;->a(IJ)I

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    goto :goto_3

    .line 88
    :cond_3
    :goto_2
    invoke-static {v1, v4, v5}, LB0/e;->a(IJ)I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    :goto_3
    neg-int v12, v12

    .line 93
    int-to-float v12, v12

    .line 94
    cmpl-float v8, v8, v12

    .line 95
    .line 96
    if-ltz v8, :cond_11

    .line 97
    .line 98
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    invoke-virtual {v9}, Lz0/J;->N()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    iget-object v10, v10, LB0/L;->O:LW0/l;

    .line 107
    .line 108
    if-eqz v13, :cond_5

    .line 109
    .line 110
    if-ne v10, v14, :cond_4

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_4
    invoke-static {v1, v4, v5}, LB0/e;->a(IJ)I

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    goto :goto_5

    .line 118
    :cond_5
    :goto_4
    invoke-static {v15, v4, v5}, LB0/e;->a(IJ)I

    .line 119
    .line 120
    .line 121
    move-result v10

    .line 122
    :goto_5
    add-int/2addr v8, v10

    .line 123
    int-to-float v8, v8

    .line 124
    cmpg-float v7, v7, v8

    .line 125
    .line 126
    if-gez v7, :cond_11

    .line 127
    .line 128
    const-wide v7, 0xffffffffL

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    and-long v7, p3, v7

    .line 134
    .line 135
    long-to-int v7, v7

    .line 136
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    invoke-static {v11, v4, v5}, LB0/e;->a(IJ)I

    .line 141
    .line 142
    .line 143
    move-result v10

    .line 144
    neg-int v10, v10

    .line 145
    int-to-float v10, v10

    .line 146
    cmpl-float v8, v8, v10

    .line 147
    .line 148
    if-ltz v8, :cond_11

    .line 149
    .line 150
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    invoke-virtual {v9}, Lz0/J;->K()I

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    invoke-static {v3, v4, v5}, LB0/e;->a(IJ)I

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    add-int/2addr v3, v8

    .line 163
    int-to-float v3, v3

    .line 164
    cmpg-float v3, v7, v3

    .line 165
    .line 166
    if-gez v3, :cond_11

    .line 167
    .line 168
    new-instance v0, LB0/l0;

    .line 169
    .line 170
    move-object/from16 v2, p1

    .line 171
    .line 172
    move-object/from16 v3, p2

    .line 173
    .line 174
    move-wide/from16 v4, p3

    .line 175
    .line 176
    move/from16 v8, p7

    .line 177
    .line 178
    move/from16 v10, p9

    .line 179
    .line 180
    move v7, v6

    .line 181
    move-object v1, v9

    .line 182
    move-object/from16 v6, p5

    .line 183
    .line 184
    move/from16 v9, p8

    .line 185
    .line 186
    invoke-direct/range {v0 .. v10}, LB0/l0;-><init>(LB0/n0;Lc0/l;LB0/e;JLB0/t;IZFZ)V

    .line 187
    .line 188
    .line 189
    move-object v7, v6

    .line 190
    move-object v6, v2

    .line 191
    iget-object v1, v7, LB0/t;->r:Lr/x;

    .line 192
    .line 193
    iget-object v2, v7, LB0/t;->q:Lr/C;

    .line 194
    .line 195
    iget v3, v7, LB0/t;->s:I

    .line 196
    .line 197
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/n2;->u(Ljava/util/List;)I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    const/4 v5, 0x0

    .line 202
    if-ne v3, v4, :cond_6

    .line 203
    .line 204
    iget v3, v7, LB0/t;->s:I

    .line 205
    .line 206
    add-int/lit8 v4, v3, 0x1

    .line 207
    .line 208
    iget v9, v2, Lr/C;->b:I

    .line 209
    .line 210
    invoke-virtual {v7, v4, v9}, LB0/t;->g(II)V

    .line 211
    .line 212
    .line 213
    iget v4, v7, LB0/t;->s:I

    .line 214
    .line 215
    add-int/2addr v4, v11

    .line 216
    iput v4, v7, LB0/t;->s:I

    .line 217
    .line 218
    invoke-virtual {v2, v6}, Lr/C;->a(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v5, v8, v11}, LB0/g;->a(FZZ)J

    .line 222
    .line 223
    .line 224
    move-result-wide v4

    .line 225
    invoke-virtual {v1, v4, v5}, Lr/x;->a(J)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, LB0/l0;->invoke()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    iput v3, v7, LB0/t;->s:I

    .line 232
    .line 233
    return-void

    .line 234
    :cond_6
    invoke-virtual {v7}, LB0/t;->d()J

    .line 235
    .line 236
    .line 237
    move-result-wide v3

    .line 238
    iget v9, v7, LB0/t;->s:I

    .line 239
    .line 240
    invoke-static {v3, v4}, LB0/g;->o(J)Z

    .line 241
    .line 242
    .line 243
    move-result v10

    .line 244
    if-eqz v10, :cond_8

    .line 245
    .line 246
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/n2;->u(Ljava/util/List;)I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    iput v3, v7, LB0/t;->s:I

    .line 251
    .line 252
    add-int/lit8 v4, v3, 0x1

    .line 253
    .line 254
    iget v10, v2, Lr/C;->b:I

    .line 255
    .line 256
    invoke-virtual {v7, v4, v10}, LB0/t;->g(II)V

    .line 257
    .line 258
    .line 259
    iget v4, v7, LB0/t;->s:I

    .line 260
    .line 261
    add-int/2addr v4, v11

    .line 262
    iput v4, v7, LB0/t;->s:I

    .line 263
    .line 264
    invoke-virtual {v2, v6}, Lr/C;->a(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v5, v8, v11}, LB0/g;->a(FZZ)J

    .line 268
    .line 269
    .line 270
    move-result-wide v12

    .line 271
    invoke-virtual {v1, v12, v13}, Lr/x;->a(J)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, LB0/l0;->invoke()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    iput v3, v7, LB0/t;->s:I

    .line 278
    .line 279
    invoke-virtual {v7}, LB0/t;->d()J

    .line 280
    .line 281
    .line 282
    move-result-wide v0

    .line 283
    invoke-static {v0, v1}, LB0/g;->k(J)F

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    cmpg-float v0, v0, v5

    .line 288
    .line 289
    if-gez v0, :cond_7

    .line 290
    .line 291
    add-int/lit8 v0, v9, 0x1

    .line 292
    .line 293
    iget v1, v7, LB0/t;->s:I

    .line 294
    .line 295
    add-int/2addr v1, v11

    .line 296
    invoke-virtual {v7, v0, v1}, LB0/t;->g(II)V

    .line 297
    .line 298
    .line 299
    :cond_7
    iput v9, v7, LB0/t;->s:I

    .line 300
    .line 301
    return-void

    .line 302
    :cond_8
    invoke-static {v3, v4}, LB0/g;->k(J)F

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    cmpl-float v3, v3, v5

    .line 307
    .line 308
    if-lez v3, :cond_9

    .line 309
    .line 310
    iget v3, v7, LB0/t;->s:I

    .line 311
    .line 312
    add-int/lit8 v4, v3, 0x1

    .line 313
    .line 314
    iget v9, v2, Lr/C;->b:I

    .line 315
    .line 316
    invoke-virtual {v7, v4, v9}, LB0/t;->g(II)V

    .line 317
    .line 318
    .line 319
    iget v4, v7, LB0/t;->s:I

    .line 320
    .line 321
    add-int/2addr v4, v11

    .line 322
    iput v4, v7, LB0/t;->s:I

    .line 323
    .line 324
    invoke-virtual {v2, v6}, Lr/C;->a(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    invoke-static {v5, v8, v11}, LB0/g;->a(FZZ)J

    .line 328
    .line 329
    .line 330
    move-result-wide v4

    .line 331
    invoke-virtual {v1, v4, v5}, Lr/x;->a(J)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v0}, LB0/l0;->invoke()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    iput v3, v7, LB0/t;->s:I

    .line 338
    .line 339
    :cond_9
    return-void

    .line 340
    :cond_a
    move-object/from16 v6, p1

    .line 341
    .line 342
    move-object/from16 v7, p5

    .line 343
    .line 344
    move/from16 v8, p7

    .line 345
    .line 346
    iget v9, v4, Lc0/l;->s:I

    .line 347
    .line 348
    and-int/2addr v9, v0

    .line 349
    if-eqz v9, :cond_10

    .line 350
    .line 351
    instance-of v9, v4, LB0/n;

    .line 352
    .line 353
    if-eqz v9, :cond_10

    .line 354
    .line 355
    move-object v9, v4

    .line 356
    check-cast v9, LB0/n;

    .line 357
    .line 358
    iget-object v9, v9, LB0/n;->F:Lc0/l;

    .line 359
    .line 360
    move v10, v1

    .line 361
    :goto_6
    if-eqz v9, :cond_f

    .line 362
    .line 363
    iget v12, v9, Lc0/l;->s:I

    .line 364
    .line 365
    and-int/2addr v12, v0

    .line 366
    if-eqz v12, :cond_e

    .line 367
    .line 368
    add-int/lit8 v10, v10, 0x1

    .line 369
    .line 370
    if-ne v10, v11, :cond_b

    .line 371
    .line 372
    move-object v4, v9

    .line 373
    goto :goto_7

    .line 374
    :cond_b
    if-nez v5, :cond_c

    .line 375
    .line 376
    new-instance v5, LR/e;

    .line 377
    .line 378
    new-array v12, v0, [Lc0/l;

    .line 379
    .line 380
    invoke-direct {v5, v12}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    :cond_c
    if-eqz v4, :cond_d

    .line 384
    .line 385
    invoke-virtual {v5, v4}, LR/e;->c(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    move-object v4, v2

    .line 389
    :cond_d
    invoke-virtual {v5, v9}, LR/e;->c(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    :cond_e
    :goto_7
    iget-object v9, v9, Lc0/l;->v:Lc0/l;

    .line 393
    .line 394
    goto :goto_6

    .line 395
    :cond_f
    if-ne v10, v11, :cond_10

    .line 396
    .line 397
    :goto_8
    move/from16 v6, p6

    .line 398
    .line 399
    goto/16 :goto_1

    .line 400
    .line 401
    :cond_10
    invoke-static {v5}, LB0/g;->f(LR/e;)Lc0/l;

    .line 402
    .line 403
    .line 404
    move-result-object v4

    .line 405
    goto :goto_8

    .line 406
    :cond_11
    move-object/from16 v6, p1

    .line 407
    .line 408
    move-object/from16 v7, p5

    .line 409
    .line 410
    move/from16 v8, p7

    .line 411
    .line 412
    if-eqz p9, :cond_12

    .line 413
    .line 414
    invoke-virtual/range {p0 .. p8}, LB0/n0;->F0(Lc0/l;LB0/e;JLB0/t;IZF)V

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    :cond_12
    move-object/from16 v3, p2

    .line 419
    .line 420
    iget v4, v3, LB0/e;->q:I

    .line 421
    .line 422
    packed-switch v4, :pswitch_data_0

    .line 423
    .line 424
    .line 425
    goto :goto_d

    .line 426
    :pswitch_0
    move-object v5, v2

    .line 427
    move-object v4, v6

    .line 428
    :goto_9
    if-eqz v4, :cond_1a

    .line 429
    .line 430
    instance-of v9, v4, LB0/y0;

    .line 431
    .line 432
    if-eqz v9, :cond_13

    .line 433
    .line 434
    check-cast v4, LB0/y0;

    .line 435
    .line 436
    invoke-interface {v4}, LB0/y0;->e0()V

    .line 437
    .line 438
    .line 439
    goto :goto_c

    .line 440
    :cond_13
    iget v9, v4, Lc0/l;->s:I

    .line 441
    .line 442
    and-int/2addr v9, v0

    .line 443
    if-eqz v9, :cond_19

    .line 444
    .line 445
    instance-of v9, v4, LB0/n;

    .line 446
    .line 447
    if-eqz v9, :cond_19

    .line 448
    .line 449
    move-object v9, v4

    .line 450
    check-cast v9, LB0/n;

    .line 451
    .line 452
    iget-object v9, v9, LB0/n;->F:Lc0/l;

    .line 453
    .line 454
    move v10, v1

    .line 455
    :goto_a
    if-eqz v9, :cond_18

    .line 456
    .line 457
    iget v12, v9, Lc0/l;->s:I

    .line 458
    .line 459
    and-int/2addr v12, v0

    .line 460
    if-eqz v12, :cond_17

    .line 461
    .line 462
    add-int/lit8 v10, v10, 0x1

    .line 463
    .line 464
    if-ne v10, v11, :cond_14

    .line 465
    .line 466
    move-object v4, v9

    .line 467
    goto :goto_b

    .line 468
    :cond_14
    if-nez v5, :cond_15

    .line 469
    .line 470
    new-instance v5, LR/e;

    .line 471
    .line 472
    new-array v12, v0, [Lc0/l;

    .line 473
    .line 474
    invoke-direct {v5, v12}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    :cond_15
    if-eqz v4, :cond_16

    .line 478
    .line 479
    invoke-virtual {v5, v4}, LR/e;->c(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    move-object v4, v2

    .line 483
    :cond_16
    invoke-virtual {v5, v9}, LR/e;->c(Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    :cond_17
    :goto_b
    iget-object v9, v9, Lc0/l;->v:Lc0/l;

    .line 487
    .line 488
    goto :goto_a

    .line 489
    :cond_18
    if-ne v10, v11, :cond_19

    .line 490
    .line 491
    goto :goto_9

    .line 492
    :cond_19
    :goto_c
    invoke-static {v5}, LB0/g;->f(LR/e;)Lc0/l;

    .line 493
    .line 494
    .line 495
    move-result-object v4

    .line 496
    goto :goto_9

    .line 497
    :cond_1a
    :goto_d
    invoke-virtual {v3}, LB0/e;->b()I

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    invoke-static {v6, v0}, LB0/g;->e(LB0/m;I)Lc0/l;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    const/4 v9, 0x0

    .line 506
    move-object/from16 v0, p0

    .line 507
    .line 508
    move/from16 v6, p6

    .line 509
    .line 510
    move-object v2, v3

    .line 511
    move-object v5, v7

    .line 512
    move v7, v8

    .line 513
    move-wide/from16 v3, p3

    .line 514
    .line 515
    move/from16 v8, p8

    .line 516
    .line 517
    invoke-virtual/range {v0 .. v9}, LB0/n0;->P0(Lc0/l;LB0/e;JLB0/t;IZFZ)V

    .line 518
    .line 519
    .line 520
    return-void

    .line 521
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public abstract Q0(Lj0/m;Lm0/c;)V
.end method

.method public final R0(JFLB5/c;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p4, v0}, LB0/n0;->U0(LB5/c;Z)V

    .line 3
    .line 4
    .line 5
    iget-wide v0, p0, LB0/n0;->M:J

    .line 6
    .line 7
    invoke-static {v0, v1, p1, p2}, LW0/i;->a(JJ)Z

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    if-nez p4, :cond_2

    .line 12
    .line 13
    iput-wide p1, p0, LB0/n0;->M:J

    .line 14
    .line 15
    iget-object p4, p0, LB0/n0;->B:LB0/L;

    .line 16
    .line 17
    iget-object v0, p4, LB0/L;->V:LB0/P;

    .line 18
    .line 19
    iget-object v0, v0, LB0/P;->p:LB0/c0;

    .line 20
    .line 21
    invoke-virtual {v0}, LB0/c0;->c0()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, LB0/n0;->V:LB0/s0;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {v0, p1, p2}, LB0/s0;->d(J)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object p1, p0, LB0/n0;->D:LB0/n0;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, LB0/n0;->I0()V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    invoke-static {p0}, LB0/T;->n0(LB0/n0;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p4, LB0/L;->D:LB0/t0;

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    check-cast p1, LC0/A;

    .line 47
    .line 48
    invoke-virtual {p1, p4}, LC0/A;->E(LB0/L;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    iput p3, p0, LB0/n0;->N:F

    .line 52
    .line 53
    iget-boolean p1, p0, LB0/T;->x:Z

    .line 54
    .line 55
    if-nez p1, :cond_3

    .line 56
    .line 57
    invoke-virtual {p0}, LB0/n0;->j0()Lz0/D;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance p2, LB0/x0;

    .line 62
    .line 63
    invoke-direct {p2, p1, p0}, LB0/x0;-><init>(Lz0/D;LB0/T;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p2}, LB0/T;->Z(LB0/x0;)V

    .line 67
    .line 68
    .line 69
    :cond_3
    return-void
.end method

.method public final S0(Li0/a;ZZ)V
    .locals 10

    .line 1
    iget-object v0, p0, LB0/n0;->V:LB0/s0;

    .line 2
    .line 3
    const-wide v1, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/16 v3, 0x20

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-boolean v4, p0, LB0/n0;->F:Z

    .line 13
    .line 14
    if-eqz v4, :cond_2

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, LB0/n0;->A0()J

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    shr-long v4, p2, v3

    .line 23
    .line 24
    long-to-int v4, v4

    .line 25
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    const/high16 v5, 0x40000000    # 2.0f

    .line 30
    .line 31
    div-float/2addr v4, v5

    .line 32
    and-long/2addr p2, v1

    .line 33
    long-to-int p2, p2

    .line 34
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    div-float/2addr p2, v5

    .line 39
    neg-float p3, v4

    .line 40
    neg-float v5, p2

    .line 41
    iget-wide v6, p0, Lz0/J;->s:J

    .line 42
    .line 43
    shr-long v8, v6, v3

    .line 44
    .line 45
    long-to-int v8, v8

    .line 46
    int-to-float v8, v8

    .line 47
    add-float/2addr v8, v4

    .line 48
    and-long/2addr v6, v1

    .line 49
    long-to-int v4, v6

    .line 50
    int-to-float v4, v4

    .line 51
    add-float/2addr v4, p2

    .line 52
    invoke-virtual {p1, p3, v5, v8, v4}, Li0/a;->a(FFFF)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    if-eqz p2, :cond_1

    .line 57
    .line 58
    iget-wide p2, p0, Lz0/J;->s:J

    .line 59
    .line 60
    shr-long v4, p2, v3

    .line 61
    .line 62
    long-to-int v4, v4

    .line 63
    int-to-float v4, v4

    .line 64
    and-long/2addr p2, v1

    .line 65
    long-to-int p2, p2

    .line 66
    int-to-float p2, p2

    .line 67
    const/4 p3, 0x0

    .line 68
    invoke-virtual {p1, p3, p3, v4, p2}, Li0/a;->a(FFFF)V

    .line 69
    .line 70
    .line 71
    :cond_1
    :goto_0
    invoke-virtual {p1}, Li0/a;->b()Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    if-eqz p2, :cond_2

    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    const/4 p2, 0x0

    .line 79
    invoke-interface {v0, p1, p2}, LB0/s0;->b(Li0/a;Z)V

    .line 80
    .line 81
    .line 82
    :cond_3
    iget-wide p2, p0, LB0/n0;->M:J

    .line 83
    .line 84
    shr-long v3, p2, v3

    .line 85
    .line 86
    long-to-int v0, v3

    .line 87
    iget v3, p1, Li0/a;->b:F

    .line 88
    .line 89
    int-to-float v0, v0

    .line 90
    add-float/2addr v3, v0

    .line 91
    iput v3, p1, Li0/a;->b:F

    .line 92
    .line 93
    iget v3, p1, Li0/a;->d:F

    .line 94
    .line 95
    add-float/2addr v3, v0

    .line 96
    iput v3, p1, Li0/a;->d:F

    .line 97
    .line 98
    and-long/2addr p2, v1

    .line 99
    long-to-int p2, p2

    .line 100
    iget p3, p1, Li0/a;->c:F

    .line 101
    .line 102
    int-to-float p2, p2

    .line 103
    add-float/2addr p3, p2

    .line 104
    iput p3, p1, Li0/a;->c:F

    .line 105
    .line 106
    iget p3, p1, Li0/a;->e:F

    .line 107
    .line 108
    add-float/2addr p3, p2

    .line 109
    iput p3, p1, Li0/a;->e:F

    .line 110
    .line 111
    return-void
.end method

.method public final T0(Lz0/D;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LB0/n0;->K:Lz0/D;

    .line 6
    .line 7
    if-eq v1, v2, :cond_18

    .line 8
    .line 9
    iput-object v1, v0, LB0/n0;->K:Lz0/D;

    .line 10
    .line 11
    iget-object v3, v0, LB0/n0;->B:LB0/L;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Lz0/D;->b()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    invoke-interface {v2}, Lz0/D;->b()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-ne v5, v6, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Lz0/D;->a()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-interface {v2}, Lz0/D;->a()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eq v5, v2, :cond_f

    .line 35
    .line 36
    :cond_0
    invoke-interface {v1}, Lz0/D;->b()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-interface {v1}, Lz0/D;->a()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    iget-object v6, v0, LB0/n0;->V:LB0/s0;

    .line 45
    .line 46
    const-wide v7, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    const/16 v9, 0x20

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    int-to-long v10, v2

    .line 56
    shl-long/2addr v10, v9

    .line 57
    int-to-long v12, v5

    .line 58
    and-long/2addr v12, v7

    .line 59
    or-long/2addr v10, v12

    .line 60
    invoke-interface {v6, v10, v11}, LB0/s0;->a(J)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {v3}, LB0/L;->G()Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    iget-object v6, v0, LB0/n0;->D:LB0/n0;

    .line 71
    .line 72
    if-eqz v6, :cond_2

    .line 73
    .line 74
    invoke-virtual {v6}, LB0/n0;->I0()V

    .line 75
    .line 76
    .line 77
    :cond_2
    :goto_0
    int-to-long v10, v2

    .line 78
    shl-long v9, v10, v9

    .line 79
    .line 80
    int-to-long v5, v5

    .line 81
    and-long/2addr v5, v7

    .line 82
    or-long/2addr v5, v9

    .line 83
    invoke-virtual {v0, v5, v6}, Lz0/J;->W(J)V

    .line 84
    .line 85
    .line 86
    iget-object v2, v0, LB0/n0;->G:LB5/c;

    .line 87
    .line 88
    if-eqz v2, :cond_3

    .line 89
    .line 90
    invoke-virtual {v0, v4}, LB0/n0;->V0(Z)Z

    .line 91
    .line 92
    .line 93
    :cond_3
    const/4 v2, 0x4

    .line 94
    invoke-static {v2}, LB0/o0;->g(I)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-virtual {v0}, LB0/n0;->B0()Lc0/l;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    if-eqz v5, :cond_4

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    iget-object v6, v6, Lc0/l;->u:Lc0/l;

    .line 106
    .line 107
    if-nez v6, :cond_5

    .line 108
    .line 109
    goto/16 :goto_7

    .line 110
    .line 111
    :cond_5
    :goto_1
    invoke-virtual {v0, v5}, LB0/n0;->D0(Z)Lc0/l;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    :goto_2
    if-eqz v5, :cond_e

    .line 116
    .line 117
    iget v7, v5, Lc0/l;->t:I

    .line 118
    .line 119
    and-int/2addr v7, v2

    .line 120
    if-eqz v7, :cond_e

    .line 121
    .line 122
    iget v7, v5, Lc0/l;->s:I

    .line 123
    .line 124
    and-int/2addr v7, v2

    .line 125
    if-eqz v7, :cond_d

    .line 126
    .line 127
    const/4 v7, 0x0

    .line 128
    move-object v8, v5

    .line 129
    move-object v9, v7

    .line 130
    :goto_3
    if-eqz v8, :cond_d

    .line 131
    .line 132
    instance-of v10, v8, LB0/p;

    .line 133
    .line 134
    if-eqz v10, :cond_6

    .line 135
    .line 136
    check-cast v8, LB0/p;

    .line 137
    .line 138
    invoke-interface {v8}, LB0/p;->d0()V

    .line 139
    .line 140
    .line 141
    goto :goto_6

    .line 142
    :cond_6
    iget v10, v8, Lc0/l;->s:I

    .line 143
    .line 144
    and-int/2addr v10, v2

    .line 145
    if-eqz v10, :cond_c

    .line 146
    .line 147
    instance-of v10, v8, LB0/n;

    .line 148
    .line 149
    if-eqz v10, :cond_c

    .line 150
    .line 151
    move-object v10, v8

    .line 152
    check-cast v10, LB0/n;

    .line 153
    .line 154
    iget-object v10, v10, LB0/n;->F:Lc0/l;

    .line 155
    .line 156
    move v11, v4

    .line 157
    :goto_4
    const/4 v12, 0x1

    .line 158
    if-eqz v10, :cond_b

    .line 159
    .line 160
    iget v13, v10, Lc0/l;->s:I

    .line 161
    .line 162
    and-int/2addr v13, v2

    .line 163
    if-eqz v13, :cond_a

    .line 164
    .line 165
    add-int/lit8 v11, v11, 0x1

    .line 166
    .line 167
    if-ne v11, v12, :cond_7

    .line 168
    .line 169
    move-object v8, v10

    .line 170
    goto :goto_5

    .line 171
    :cond_7
    if-nez v9, :cond_8

    .line 172
    .line 173
    new-instance v9, LR/e;

    .line 174
    .line 175
    const/16 v12, 0x10

    .line 176
    .line 177
    new-array v12, v12, [Lc0/l;

    .line 178
    .line 179
    invoke-direct {v9, v12}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :cond_8
    if-eqz v8, :cond_9

    .line 183
    .line 184
    invoke-virtual {v9, v8}, LR/e;->c(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    move-object v8, v7

    .line 188
    :cond_9
    invoke-virtual {v9, v10}, LR/e;->c(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_a
    :goto_5
    iget-object v10, v10, Lc0/l;->v:Lc0/l;

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_b
    if-ne v11, v12, :cond_c

    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_c
    :goto_6
    invoke-static {v9}, LB0/g;->f(LR/e;)Lc0/l;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    goto :goto_3

    .line 202
    :cond_d
    if-eq v5, v6, :cond_e

    .line 203
    .line 204
    iget-object v5, v5, Lc0/l;->v:Lc0/l;

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_e
    :goto_7
    iget-object v2, v3, LB0/L;->D:LB0/t0;

    .line 208
    .line 209
    if-eqz v2, :cond_f

    .line 210
    .line 211
    check-cast v2, LC0/A;

    .line 212
    .line 213
    invoke-virtual {v2, v3}, LC0/A;->E(LB0/L;)V

    .line 214
    .line 215
    .line 216
    :cond_f
    iget-object v2, v0, LB0/n0;->L:Lr/B;

    .line 217
    .line 218
    if-eqz v2, :cond_10

    .line 219
    .line 220
    iget v2, v2, Lr/B;->e:I

    .line 221
    .line 222
    if-eqz v2, :cond_10

    .line 223
    .line 224
    goto :goto_8

    .line 225
    :cond_10
    invoke-interface {v1}, Lz0/D;->c()Ljava/util/Map;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-nez v2, :cond_18

    .line 234
    .line 235
    :goto_8
    iget-object v2, v0, LB0/n0;->L:Lr/B;

    .line 236
    .line 237
    invoke-interface {v1}, Lz0/D;->c()Ljava/util/Map;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    if-nez v2, :cond_11

    .line 242
    .line 243
    goto :goto_b

    .line 244
    :cond_11
    iget v6, v2, Lr/B;->e:I

    .line 245
    .line 246
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    if-eq v6, v7, :cond_12

    .line 251
    .line 252
    goto :goto_b

    .line 253
    :cond_12
    iget-object v6, v2, Lr/B;->b:[Ljava/lang/Object;

    .line 254
    .line 255
    iget-object v7, v2, Lr/B;->c:[I

    .line 256
    .line 257
    iget-object v2, v2, Lr/B;->a:[J

    .line 258
    .line 259
    array-length v8, v2

    .line 260
    add-int/lit8 v8, v8, -0x2

    .line 261
    .line 262
    if-ltz v8, :cond_18

    .line 263
    .line 264
    move v9, v4

    .line 265
    :goto_9
    aget-wide v10, v2, v9

    .line 266
    .line 267
    not-long v12, v10

    .line 268
    const/4 v14, 0x7

    .line 269
    shl-long/2addr v12, v14

    .line 270
    and-long/2addr v12, v10

    .line 271
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    and-long/2addr v12, v14

    .line 277
    cmp-long v12, v12, v14

    .line 278
    .line 279
    if-eqz v12, :cond_17

    .line 280
    .line 281
    sub-int v12, v9, v8

    .line 282
    .line 283
    not-int v12, v12

    .line 284
    ushr-int/lit8 v12, v12, 0x1f

    .line 285
    .line 286
    const/16 v13, 0x8

    .line 287
    .line 288
    rsub-int/lit8 v12, v12, 0x8

    .line 289
    .line 290
    move v14, v4

    .line 291
    :goto_a
    if-ge v14, v12, :cond_16

    .line 292
    .line 293
    const-wide/16 v15, 0xff

    .line 294
    .line 295
    and-long/2addr v15, v10

    .line 296
    const-wide/16 v17, 0x80

    .line 297
    .line 298
    cmp-long v15, v15, v17

    .line 299
    .line 300
    if-gez v15, :cond_15

    .line 301
    .line 302
    shl-int/lit8 v15, v9, 0x3

    .line 303
    .line 304
    add-int/2addr v15, v14

    .line 305
    aget-object v16, v6, v15

    .line 306
    .line 307
    aget v15, v7, v15

    .line 308
    .line 309
    move-object/from16 v4, v16

    .line 310
    .line 311
    check-cast v4, Lz0/l;

    .line 312
    .line 313
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    check-cast v4, Ljava/lang/Integer;

    .line 318
    .line 319
    if-nez v4, :cond_13

    .line 320
    .line 321
    goto :goto_b

    .line 322
    :cond_13
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    if-eq v4, v15, :cond_15

    .line 327
    .line 328
    :goto_b
    iget-object v2, v3, LB0/L;->V:LB0/P;

    .line 329
    .line 330
    iget-object v2, v2, LB0/P;->p:LB0/c0;

    .line 331
    .line 332
    iget-object v2, v2, LB0/c0;->M:LB0/M;

    .line 333
    .line 334
    invoke-virtual {v2}, LB0/M;->f()V

    .line 335
    .line 336
    .line 337
    iget-object v2, v0, LB0/n0;->L:Lr/B;

    .line 338
    .line 339
    if-nez v2, :cond_14

    .line 340
    .line 341
    sget-object v2, Lr/L;->a:Lr/B;

    .line 342
    .line 343
    new-instance v2, Lr/B;

    .line 344
    .line 345
    invoke-direct {v2}, Lr/B;-><init>()V

    .line 346
    .line 347
    .line 348
    iput-object v2, v0, LB0/n0;->L:Lr/B;

    .line 349
    .line 350
    :cond_14
    invoke-virtual {v2}, Lr/B;->a()V

    .line 351
    .line 352
    .line 353
    invoke-interface {v1}, Lz0/D;->c()Ljava/util/Map;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    if-eqz v3, :cond_18

    .line 370
    .line 371
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    check-cast v3, Ljava/util/Map$Entry;

    .line 376
    .line 377
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    check-cast v3, Ljava/lang/Number;

    .line 386
    .line 387
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    invoke-virtual {v2, v3, v4}, Lr/B;->g(ILjava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    goto :goto_c

    .line 395
    :cond_15
    shr-long/2addr v10, v13

    .line 396
    add-int/lit8 v14, v14, 0x1

    .line 397
    .line 398
    const/4 v4, 0x0

    .line 399
    goto :goto_a

    .line 400
    :cond_16
    if-ne v12, v13, :cond_18

    .line 401
    .line 402
    :cond_17
    if-eq v9, v8, :cond_18

    .line 403
    .line 404
    add-int/lit8 v9, v9, 0x1

    .line 405
    .line 406
    const/4 v4, 0x0

    .line 407
    goto/16 :goto_9

    .line 408
    .line 409
    :cond_18
    return-void
.end method

.method public final U0(LB5/c;Z)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, LB0/n0;->B:LB0/L;

    .line 4
    .line 5
    if-nez p2, :cond_1

    .line 6
    .line 7
    iget-object p2, p0, LB0/n0;->G:LB5/c;

    .line 8
    .line 9
    if-ne p2, p1, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, LB0/n0;->H:LW0/c;

    .line 12
    .line 13
    iget-object v3, v2, LB0/L;->N:LW0/c;

    .line 14
    .line 15
    invoke-static {p2, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    iget-object p2, p0, LB0/n0;->I:LW0/l;

    .line 22
    .line 23
    iget-object v3, v2, LB0/L;->O:LW0/l;

    .line 24
    .line 25
    if-eq p2, v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move p2, v0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    move p2, v1

    .line 31
    :goto_1
    iget-object v3, v2, LB0/L;->N:LW0/c;

    .line 32
    .line 33
    iput-object v3, p0, LB0/n0;->H:LW0/c;

    .line 34
    .line 35
    iget-object v3, v2, LB0/L;->O:LW0/l;

    .line 36
    .line 37
    iput-object v3, p0, LB0/n0;->I:LW0/l;

    .line 38
    .line 39
    invoke-virtual {v2}, LB0/L;->F()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    iget-object v4, p0, LB0/n0;->T:LB0/k0;

    .line 44
    .line 45
    if-eqz v3, :cond_4

    .line 46
    .line 47
    if-eqz p1, :cond_4

    .line 48
    .line 49
    iput-object p1, p0, LB0/n0;->G:LB5/c;

    .line 50
    .line 51
    iget-object p1, p0, LB0/n0;->V:LB0/s0;

    .line 52
    .line 53
    if-nez p1, :cond_2

    .line 54
    .line 55
    invoke-static {v2}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p0}, LB0/n0;->y0()LB5/e;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    iget-boolean v0, v2, LB0/L;->w:Z

    .line 64
    .line 65
    const/4 v3, 0x4

    .line 66
    invoke-static {p1, p2, v4, v0, v3}, LB0/t0;->d(LB0/t0;LB5/e;LB0/k0;ZI)LB0/s0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iget-wide v5, p0, Lz0/J;->s:J

    .line 71
    .line 72
    invoke-interface {p1, v5, v6}, LB0/s0;->a(J)V

    .line 73
    .line 74
    .line 75
    iget-wide v5, p0, LB0/n0;->M:J

    .line 76
    .line 77
    invoke-interface {p1, v5, v6}, LB0/s0;->d(J)V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, LB0/n0;->V:LB0/s0;

    .line 81
    .line 82
    invoke-virtual {p0, v1}, LB0/n0;->V0(Z)Z

    .line 83
    .line 84
    .line 85
    iput-boolean v1, v2, LB0/L;->Y:Z

    .line 86
    .line 87
    invoke-virtual {v4}, LB0/k0;->invoke()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    if-eqz p2, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0, v1}, LB0/n0;->V0(Z)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_3

    .line 98
    .line 99
    invoke-static {v2}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, LC0/A;

    .line 104
    .line 105
    invoke-virtual {p1}, LC0/A;->getRectManager()LJ0/a;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1, v2}, LJ0/a;->e(LB0/L;)V

    .line 110
    .line 111
    .line 112
    :cond_3
    return-void

    .line 113
    :cond_4
    const/4 p1, 0x0

    .line 114
    iput-object p1, p0, LB0/n0;->G:LB5/c;

    .line 115
    .line 116
    iget-object p2, p0, LB0/n0;->V:LB0/s0;

    .line 117
    .line 118
    if-eqz p2, :cond_5

    .line 119
    .line 120
    invoke-interface {p2}, LB0/s0;->destroy()V

    .line 121
    .line 122
    .line 123
    iput-boolean v1, v2, LB0/L;->Y:Z

    .line 124
    .line 125
    invoke-virtual {v4}, LB0/k0;->invoke()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, LB0/n0;->B0()Lc0/l;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    iget-boolean p2, p2, Lc0/l;->D:Z

    .line 133
    .line 134
    if-eqz p2, :cond_5

    .line 135
    .line 136
    invoke-virtual {v2}, LB0/L;->G()Z

    .line 137
    .line 138
    .line 139
    move-result p2

    .line 140
    if-eqz p2, :cond_5

    .line 141
    .line 142
    iget-object p2, v2, LB0/L;->D:LB0/t0;

    .line 143
    .line 144
    if-eqz p2, :cond_5

    .line 145
    .line 146
    check-cast p2, LC0/A;

    .line 147
    .line 148
    invoke-virtual {p2, v2}, LC0/A;->E(LB0/L;)V

    .line 149
    .line 150
    .line 151
    :cond_5
    iput-object p1, p0, LB0/n0;->V:LB0/s0;

    .line 152
    .line 153
    iput-boolean v0, p0, LB0/n0;->U:Z

    .line 154
    .line 155
    return-void
.end method

.method public final V0(Z)Z
    .locals 9

    .line 1
    iget-object v0, p0, LB0/n0;->V:LB0/s0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_b

    .line 5
    .line 6
    iget-object v2, p0, LB0/n0;->G:LB5/c;

    .line 7
    .line 8
    if-eqz v2, :cond_a

    .line 9
    .line 10
    sget-object v3, LB0/n0;->W:Lj0/C;

    .line 11
    .line 12
    const/high16 v4, 0x3f800000    # 1.0f

    .line 13
    .line 14
    invoke-virtual {v3, v4}, Lj0/C;->c(F)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v4}, Lj0/C;->e(F)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v4}, Lj0/C;->a(F)V

    .line 21
    .line 22
    .line 23
    iget v4, v3, Lj0/C;->u:F

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    cmpg-float v4, v4, v5

    .line 27
    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget v4, v3, Lj0/C;->q:I

    .line 32
    .line 33
    or-int/lit8 v4, v4, 0x20

    .line 34
    .line 35
    iput v4, v3, Lj0/C;->q:I

    .line 36
    .line 37
    iput v5, v3, Lj0/C;->u:F

    .line 38
    .line 39
    :goto_0
    sget-wide v4, Lj0/u;->a:J

    .line 40
    .line 41
    iget-wide v6, v3, Lj0/C;->v:J

    .line 42
    .line 43
    invoke-static {v6, v7, v4, v5}, Lj0/o;->c(JJ)Z

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    if-nez v6, :cond_1

    .line 48
    .line 49
    iget v6, v3, Lj0/C;->q:I

    .line 50
    .line 51
    or-int/lit8 v6, v6, 0x40

    .line 52
    .line 53
    iput v6, v3, Lj0/C;->q:I

    .line 54
    .line 55
    iput-wide v4, v3, Lj0/C;->v:J

    .line 56
    .line 57
    :cond_1
    iget-wide v6, v3, Lj0/C;->w:J

    .line 58
    .line 59
    invoke-static {v6, v7, v4, v5}, Lj0/o;->c(JJ)Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-nez v6, :cond_2

    .line 64
    .line 65
    iget v6, v3, Lj0/C;->q:I

    .line 66
    .line 67
    or-int/lit16 v6, v6, 0x80

    .line 68
    .line 69
    iput v6, v3, Lj0/C;->q:I

    .line 70
    .line 71
    iput-wide v4, v3, Lj0/C;->w:J

    .line 72
    .line 73
    :cond_2
    iget v4, v3, Lj0/C;->x:F

    .line 74
    .line 75
    const/high16 v5, 0x41000000    # 8.0f

    .line 76
    .line 77
    cmpg-float v4, v4, v5

    .line 78
    .line 79
    if-nez v4, :cond_3

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    iget v4, v3, Lj0/C;->q:I

    .line 83
    .line 84
    or-int/lit16 v4, v4, 0x800

    .line 85
    .line 86
    iput v4, v3, Lj0/C;->q:I

    .line 87
    .line 88
    iput v5, v3, Lj0/C;->x:F

    .line 89
    .line 90
    :goto_1
    sget-wide v4, Lj0/H;->b:J

    .line 91
    .line 92
    invoke-virtual {v3, v4, v5}, Lj0/C;->g(J)V

    .line 93
    .line 94
    .line 95
    iget-object v4, v3, Lj0/C;->z:Lj0/E;

    .line 96
    .line 97
    sget-object v5, Lj0/B;->a:LO3/D;

    .line 98
    .line 99
    invoke-static {v4, v5}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-nez v4, :cond_4

    .line 104
    .line 105
    iget v4, v3, Lj0/C;->q:I

    .line 106
    .line 107
    or-int/lit16 v4, v4, 0x2000

    .line 108
    .line 109
    iput v4, v3, Lj0/C;->q:I

    .line 110
    .line 111
    iput-object v5, v3, Lj0/C;->z:Lj0/E;

    .line 112
    .line 113
    :cond_4
    iget-boolean v4, v3, Lj0/C;->A:Z

    .line 114
    .line 115
    if-eqz v4, :cond_5

    .line 116
    .line 117
    iget v4, v3, Lj0/C;->q:I

    .line 118
    .line 119
    or-int/lit16 v4, v4, 0x4000

    .line 120
    .line 121
    iput v4, v3, Lj0/C;->q:I

    .line 122
    .line 123
    iput-boolean v1, v3, Lj0/C;->A:Z

    .line 124
    .line 125
    :cond_5
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    iput-wide v4, v3, Lj0/C;->B:J

    .line 131
    .line 132
    const/4 v4, 0x0

    .line 133
    iput-object v4, v3, Lj0/C;->E:Lj0/B;

    .line 134
    .line 135
    iput v1, v3, Lj0/C;->q:I

    .line 136
    .line 137
    iget-object v4, p0, LB0/n0;->B:LB0/L;

    .line 138
    .line 139
    iget-object v5, v4, LB0/L;->N:LW0/c;

    .line 140
    .line 141
    iput-object v5, v3, Lj0/C;->C:LW0/c;

    .line 142
    .line 143
    iget-object v5, v4, LB0/L;->O:LW0/l;

    .line 144
    .line 145
    iput-object v5, v3, Lj0/C;->D:LW0/l;

    .line 146
    .line 147
    iget-wide v5, p0, Lz0/J;->s:J

    .line 148
    .line 149
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/measurement/P1;->d0(J)J

    .line 150
    .line 151
    .line 152
    move-result-wide v5

    .line 153
    iput-wide v5, v3, Lj0/C;->B:J

    .line 154
    .line 155
    invoke-static {v4}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    check-cast v5, LC0/A;

    .line 160
    .line 161
    invoke-virtual {v5}, LC0/A;->getSnapshotObserver()LB0/v0;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    sget-object v6, LB0/f;->u:LB0/f;

    .line 166
    .line 167
    new-instance v7, LA0/d;

    .line 168
    .line 169
    const/4 v8, 0x2

    .line 170
    invoke-direct {v7, v8, v2}, LA0/d;-><init>(ILjava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5, p0, v6, v7}, LB0/v0;->a(LB0/u0;LB5/c;LB5/a;)V

    .line 174
    .line 175
    .line 176
    iget-object v2, p0, LB0/n0;->P:LB0/x;

    .line 177
    .line 178
    if-nez v2, :cond_6

    .line 179
    .line 180
    new-instance v2, LB0/x;

    .line 181
    .line 182
    invoke-direct {v2}, LB0/x;-><init>()V

    .line 183
    .line 184
    .line 185
    iput-object v2, p0, LB0/n0;->P:LB0/x;

    .line 186
    .line 187
    :cond_6
    sget-object v5, LB0/n0;->X:LB0/x;

    .line 188
    .line 189
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    iget v6, v2, LB0/x;->a:F

    .line 193
    .line 194
    iput v6, v5, LB0/x;->a:F

    .line 195
    .line 196
    iget v6, v2, LB0/x;->b:F

    .line 197
    .line 198
    iput v6, v5, LB0/x;->b:F

    .line 199
    .line 200
    iget v6, v2, LB0/x;->c:F

    .line 201
    .line 202
    iput v6, v5, LB0/x;->c:F

    .line 203
    .line 204
    iget-wide v6, v2, LB0/x;->d:J

    .line 205
    .line 206
    iput-wide v6, v5, LB0/x;->d:J

    .line 207
    .line 208
    iget v6, v3, Lj0/C;->r:F

    .line 209
    .line 210
    iput v6, v2, LB0/x;->a:F

    .line 211
    .line 212
    iget v6, v3, Lj0/C;->s:F

    .line 213
    .line 214
    iput v6, v2, LB0/x;->b:F

    .line 215
    .line 216
    iget v6, v3, Lj0/C;->x:F

    .line 217
    .line 218
    iput v6, v2, LB0/x;->c:F

    .line 219
    .line 220
    iget-wide v6, v3, Lj0/C;->y:J

    .line 221
    .line 222
    iput-wide v6, v2, LB0/x;->d:J

    .line 223
    .line 224
    invoke-interface {v0, v3}, LB0/s0;->c(Lj0/C;)V

    .line 225
    .line 226
    .line 227
    iget-boolean v0, p0, LB0/n0;->F:Z

    .line 228
    .line 229
    iget-boolean v6, v3, Lj0/C;->A:Z

    .line 230
    .line 231
    iput-boolean v6, p0, LB0/n0;->F:Z

    .line 232
    .line 233
    iget v3, v3, Lj0/C;->t:F

    .line 234
    .line 235
    iput v3, p0, LB0/n0;->J:F

    .line 236
    .line 237
    iget v3, v5, LB0/x;->a:F

    .line 238
    .line 239
    iget v6, v2, LB0/x;->a:F

    .line 240
    .line 241
    cmpg-float v3, v3, v6

    .line 242
    .line 243
    if-nez v3, :cond_7

    .line 244
    .line 245
    iget v3, v5, LB0/x;->b:F

    .line 246
    .line 247
    iget v6, v2, LB0/x;->b:F

    .line 248
    .line 249
    cmpg-float v3, v3, v6

    .line 250
    .line 251
    if-nez v3, :cond_7

    .line 252
    .line 253
    iget v3, v5, LB0/x;->c:F

    .line 254
    .line 255
    iget v6, v2, LB0/x;->c:F

    .line 256
    .line 257
    cmpg-float v3, v3, v6

    .line 258
    .line 259
    if-nez v3, :cond_7

    .line 260
    .line 261
    iget-wide v5, v5, LB0/x;->d:J

    .line 262
    .line 263
    iget-wide v2, v2, LB0/x;->d:J

    .line 264
    .line 265
    invoke-static {v5, v6, v2, v3}, Lj0/H;->a(JJ)Z

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    if-eqz v2, :cond_7

    .line 270
    .line 271
    const/4 v1, 0x1

    .line 272
    :cond_7
    xor-int/lit8 v2, v1, 0x1

    .line 273
    .line 274
    if-eqz p1, :cond_9

    .line 275
    .line 276
    if-eqz v1, :cond_8

    .line 277
    .line 278
    iget-boolean p1, p0, LB0/n0;->F:Z

    .line 279
    .line 280
    if-eq v0, p1, :cond_9

    .line 281
    .line 282
    :cond_8
    iget-object p1, v4, LB0/L;->D:LB0/t0;

    .line 283
    .line 284
    if-eqz p1, :cond_9

    .line 285
    .line 286
    check-cast p1, LC0/A;

    .line 287
    .line 288
    invoke-virtual {p1, v4}, LC0/A;->E(LB0/L;)V

    .line 289
    .line 290
    .line 291
    :cond_9
    return v2

    .line 292
    :cond_a
    const-string p1, "updateLayerParameters requires a non-null layerBlock"

    .line 293
    .line 294
    invoke-static {p1}, LC0/S;->i(Ljava/lang/String;)LC2/e;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    throw p1

    .line 299
    :cond_b
    iget-object p1, p0, LB0/n0;->G:LB5/c;

    .line 300
    .line 301
    if-nez p1, :cond_c

    .line 302
    .line 303
    return v1

    .line 304
    :cond_c
    const-string p1, "null layer with a non-null layerBlock"

    .line 305
    .line 306
    invoke-static {p1}, Ly0/a;->b(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    return v1
.end method

.method public final W0(J)Z
    .locals 4

    .line 1
    const-wide v0, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long v2, p1, v0

    .line 7
    .line 8
    xor-long/2addr v0, v2

    .line 9
    const-wide v2, 0x100000001L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    sub-long/2addr v0, v2

    .line 15
    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long/2addr v0, v2

    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, LB0/n0;->V:LB0/s0;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-boolean v1, p0, LB0/n0;->F:Z

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-interface {v0, p1, p2}, LB0/s0;->h(J)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_1

    .line 40
    .line 41
    :cond_0
    const/4 p1, 0x1

    .line 42
    return p1

    .line 43
    :cond_1
    const/4 p1, 0x0

    .line 44
    return p1
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, LB0/n0;->B:LB0/L;

    .line 2
    .line 3
    iget-object v0, v0, LB0/L;->N:LW0/c;

    .line 4
    .line 5
    invoke-interface {v0}, LW0/c;->b()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final c0()LB0/T;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/n0;->C:LB0/n0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d0()Lz0/m;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final e(J)J
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, LB0/n0;->F(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-object v0, p0, LB0/n0;->B:LB0/L;

    .line 6
    .line 7
    invoke-static {v0}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LC0/A;

    .line 12
    .line 13
    invoke-virtual {v0}, LC0/A;->I()V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, LC0/A;->i0:[F

    .line 17
    .line 18
    invoke-static {v0, p1, p2}, Lj0/B;->o([FJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1

    .line 22
    return-wide p1
.end method

.method public final e0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LB0/n0;->K:Lz0/D;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final g()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, LB0/n0;->B:LB0/L;

    .line 2
    .line 3
    iget-object v1, v0, LB0/L;->U:LB0/g0;

    .line 4
    .line 5
    const/16 v2, 0x40

    .line 6
    .line 7
    invoke-virtual {v1, v2}, LB0/g0;->d(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_9

    .line 13
    .line 14
    invoke-virtual {p0}, LB0/n0;->B0()Lc0/l;

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, LB0/L;->U:LB0/g0;

    .line 18
    .line 19
    iget-object v0, v0, LB0/g0;->d:LB0/B0;

    .line 20
    .line 21
    move-object v1, v3

    .line 22
    :goto_0
    if-eqz v0, :cond_8

    .line 23
    .line 24
    iget v4, v0, Lc0/l;->s:I

    .line 25
    .line 26
    and-int/2addr v4, v2

    .line 27
    if-eqz v4, :cond_7

    .line 28
    .line 29
    move-object v4, v0

    .line 30
    move-object v5, v3

    .line 31
    :goto_1
    if-eqz v4, :cond_7

    .line 32
    .line 33
    instance-of v6, v4, LB0/w0;

    .line 34
    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    check-cast v4, LB0/w0;

    .line 38
    .line 39
    invoke-interface {v4, v1}, LB0/w0;->c0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    goto :goto_4

    .line 44
    :cond_0
    iget v6, v4, Lc0/l;->s:I

    .line 45
    .line 46
    and-int/2addr v6, v2

    .line 47
    if-eqz v6, :cond_6

    .line 48
    .line 49
    instance-of v6, v4, LB0/n;

    .line 50
    .line 51
    if-eqz v6, :cond_6

    .line 52
    .line 53
    move-object v6, v4

    .line 54
    check-cast v6, LB0/n;

    .line 55
    .line 56
    iget-object v6, v6, LB0/n;->F:Lc0/l;

    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    :goto_2
    const/4 v8, 0x1

    .line 60
    if-eqz v6, :cond_5

    .line 61
    .line 62
    iget v9, v6, Lc0/l;->s:I

    .line 63
    .line 64
    and-int/2addr v9, v2

    .line 65
    if-eqz v9, :cond_4

    .line 66
    .line 67
    add-int/lit8 v7, v7, 0x1

    .line 68
    .line 69
    if-ne v7, v8, :cond_1

    .line 70
    .line 71
    move-object v4, v6

    .line 72
    goto :goto_3

    .line 73
    :cond_1
    if-nez v5, :cond_2

    .line 74
    .line 75
    new-instance v5, LR/e;

    .line 76
    .line 77
    const/16 v8, 0x10

    .line 78
    .line 79
    new-array v8, v8, [Lc0/l;

    .line 80
    .line 81
    invoke-direct {v5, v8}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    if-eqz v4, :cond_3

    .line 85
    .line 86
    invoke-virtual {v5, v4}, LR/e;->c(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move-object v4, v3

    .line 90
    :cond_3
    invoke-virtual {v5, v6}, LR/e;->c(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_4
    :goto_3
    iget-object v6, v6, Lc0/l;->v:Lc0/l;

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    if-ne v7, v8, :cond_6

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_6
    :goto_4
    invoke-static {v5}, LB0/g;->f(LR/e;)Lc0/l;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    goto :goto_1

    .line 104
    :cond_7
    iget-object v0, v0, Lc0/l;->u:Lc0/l;

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_8
    return-object v1

    .line 108
    :cond_9
    return-object v3
.end method

.method public final getLayoutDirection()LW0/l;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/n0;->B:LB0/L;

    .line 2
    .line 3
    iget-object v0, v0, LB0/L;->O:LW0/l;

    .line 4
    .line 5
    return-object v0
.end method

.method public final h()Lz0/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, LB0/n0;->B0()Lc0/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lc0/l;->D:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Ly0/a;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, LB0/n0;->M0()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LB0/n0;->B:LB0/L;

    .line 18
    .line 19
    iget-object v0, v0, LB0/L;->U:LB0/g0;

    .line 20
    .line 21
    iget-object v0, v0, LB0/g0;->c:LB0/n0;

    .line 22
    .line 23
    iget-object v0, v0, LB0/n0;->D:LB0/n0;

    .line 24
    .line 25
    return-object v0
.end method

.method public final h0()LB0/L;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/n0;->B:LB0/L;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j0()Lz0/D;
    .locals 2

    .line 1
    iget-object v0, p0, LB0/n0;->K:Lz0/D;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "Asking for measurement result of unmeasured layout modifier"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final l()F
    .locals 1

    .line 1
    iget-object v0, p0, LB0/n0;->B:LB0/L;

    .line 2
    .line 3
    iget-object v0, v0, LB0/L;->N:LW0/c;

    .line 4
    .line 5
    invoke-interface {v0}, LW0/c;->l()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final l0()LB0/T;
    .locals 1

    .line 1
    iget-object v0, p0, LB0/n0;->D:LB0/n0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m0()J
    .locals 2

    .line 1
    iget-wide v0, p0, LB0/n0;->M:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final o0()V
    .locals 4

    .line 1
    iget-wide v0, p0, LB0/n0;->M:J

    .line 2
    .line 3
    iget v2, p0, LB0/n0;->N:F

    .line 4
    .line 5
    iget-object v3, p0, LB0/n0;->G:LB5/c;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, v2, v3}, Lz0/J;->U(JFLB5/c;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final p0(LB0/n0;Li0/a;Z)V
    .locals 6

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, LB0/n0;->D:LB0/n0;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, LB0/n0;->p0(LB0/n0;Li0/a;Z)V

    .line 9
    .line 10
    .line 11
    :cond_1
    iget-wide v0, p0, LB0/n0;->M:J

    .line 12
    .line 13
    const/16 p1, 0x20

    .line 14
    .line 15
    shr-long v2, v0, p1

    .line 16
    .line 17
    long-to-int v2, v2

    .line 18
    iget v3, p2, Li0/a;->b:F

    .line 19
    .line 20
    int-to-float v2, v2

    .line 21
    sub-float/2addr v3, v2

    .line 22
    iput v3, p2, Li0/a;->b:F

    .line 23
    .line 24
    iget v3, p2, Li0/a;->d:F

    .line 25
    .line 26
    sub-float/2addr v3, v2

    .line 27
    iput v3, p2, Li0/a;->d:F

    .line 28
    .line 29
    const-wide v2, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v0, v2

    .line 35
    long-to-int v0, v0

    .line 36
    iget v1, p2, Li0/a;->c:F

    .line 37
    .line 38
    int-to-float v0, v0

    .line 39
    sub-float/2addr v1, v0

    .line 40
    iput v1, p2, Li0/a;->c:F

    .line 41
    .line 42
    iget v1, p2, Li0/a;->e:F

    .line 43
    .line 44
    sub-float/2addr v1, v0

    .line 45
    iput v1, p2, Li0/a;->e:F

    .line 46
    .line 47
    iget-object v0, p0, LB0/n0;->V:LB0/s0;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-interface {v0, p2, v1}, LB0/s0;->b(Li0/a;Z)V

    .line 53
    .line 54
    .line 55
    iget-boolean v0, p0, LB0/n0;->F:Z

    .line 56
    .line 57
    if-eqz v0, :cond_2

    .line 58
    .line 59
    if-eqz p3, :cond_2

    .line 60
    .line 61
    iget-wide v0, p0, Lz0/J;->s:J

    .line 62
    .line 63
    shr-long v4, v0, p1

    .line 64
    .line 65
    long-to-int p1, v4

    .line 66
    int-to-float p1, p1

    .line 67
    and-long/2addr v0, v2

    .line 68
    long-to-int p3, v0

    .line 69
    int-to-float p3, p3

    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-virtual {p2, v0, v0, p1, p3}, Li0/a;->a(FFFF)V

    .line 72
    .line 73
    .line 74
    :cond_2
    :goto_0
    return-void
.end method

.method public final q0(LB0/n0;J)J
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-wide p2

    .line 4
    :cond_0
    iget-object v0, p0, LB0/n0;->D:LB0/n0;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v0, p1, p2, p3}, LB0/n0;->q0(LB0/n0;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    invoke-virtual {p0, p1, p2}, LB0/n0;->x0(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    return-wide p1

    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3}, LB0/n0;->x0(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    return-wide p1
.end method

.method public final r0(J)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {p0}, Lz0/J;->N()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    int-to-float v2, v2

    .line 15
    sub-float/2addr v1, v2

    .line 16
    const-wide v2, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr p1, v2

    .line 22
    long-to-int p1, p1

    .line 23
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0}, Lz0/J;->K()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    int-to-float p2, p2

    .line 32
    sub-float/2addr p1, p2

    .line 33
    const/high16 p2, 0x40000000    # 2.0f

    .line 34
    .line 35
    div-float/2addr v1, p2

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    div-float/2addr p1, p2

    .line 42
    invoke-static {v4, p1}, Ljava/lang/Math;->max(FF)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    int-to-long v4, p2

    .line 51
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    int-to-long p1, p1

    .line 56
    shl-long v0, v4, v0

    .line 57
    .line 58
    and-long/2addr p1, v2

    .line 59
    or-long/2addr p1, v0

    .line 60
    return-wide p1
.end method

.method public final s0(JJ)F
    .locals 8

    .line 1
    invoke-virtual {p0}, Lz0/J;->N()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    shr-long v2, p3, v1

    .line 9
    .line 10
    long-to-int v2, v2

    .line 11
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    cmpl-float v0, v0, v2

    .line 16
    .line 17
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 18
    .line 19
    const-wide v3, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    if-ltz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lz0/J;->K()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    int-to-float v0, v0

    .line 31
    and-long v5, p3, v3

    .line 32
    .line 33
    long-to-int v5, v5

    .line 34
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    cmpl-float v0, v0, v5

    .line 39
    .line 40
    if-ltz v0, :cond_0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    invoke-virtual {p0, p3, p4}, LB0/n0;->r0(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide p3

    .line 47
    shr-long v5, p3, v1

    .line 48
    .line 49
    long-to-int v0, v5

    .line 50
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    and-long/2addr p3, v3

    .line 55
    long-to-int p3, p3

    .line 56
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    shr-long v5, p1, v1

    .line 61
    .line 62
    long-to-int p4, v5

    .line 63
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    const/4 v5, 0x0

    .line 68
    cmpg-float v6, p4, v5

    .line 69
    .line 70
    if-gez v6, :cond_1

    .line 71
    .line 72
    neg-float p4, p4

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p0}, Lz0/J;->N()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    int-to-float v6, v6

    .line 79
    sub-float/2addr p4, v6

    .line 80
    :goto_0
    invoke-static {v5, p4}, Ljava/lang/Math;->max(FF)F

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    and-long/2addr p1, v3

    .line 85
    long-to-int p1, p1

    .line 86
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    cmpg-float p2, p1, v5

    .line 91
    .line 92
    if-gez p2, :cond_2

    .line 93
    .line 94
    neg-float p1, p1

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {p0}, Lz0/J;->K()I

    .line 97
    .line 98
    .line 99
    move-result p2

    .line 100
    int-to-float p2, p2

    .line 101
    sub-float/2addr p1, p2

    .line 102
    :goto_1
    invoke-static {v5, p1}, Ljava/lang/Math;->max(FF)F

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    int-to-long v6, p2

    .line 111
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    int-to-long p1, p1

    .line 116
    shl-long/2addr v6, v1

    .line 117
    and-long/2addr p1, v3

    .line 118
    or-long/2addr p1, v6

    .line 119
    cmpl-float p4, v0, v5

    .line 120
    .line 121
    if-gtz p4, :cond_3

    .line 122
    .line 123
    cmpl-float p4, p3, v5

    .line 124
    .line 125
    if-lez p4, :cond_4

    .line 126
    .line 127
    :cond_3
    shr-long v5, p1, v1

    .line 128
    .line 129
    long-to-int p4, v5

    .line 130
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    cmpg-float v0, v1, v0

    .line 135
    .line 136
    if-gtz v0, :cond_4

    .line 137
    .line 138
    and-long/2addr p1, v3

    .line 139
    long-to-int p1, p1

    .line 140
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 141
    .line 142
    .line 143
    move-result p2

    .line 144
    cmpg-float p2, p2, p3

    .line 145
    .line 146
    if-gtz p2, :cond_4

    .line 147
    .line 148
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    mul-float/2addr p2, p2

    .line 157
    mul-float/2addr p1, p1

    .line 158
    add-float/2addr p1, p2

    .line 159
    return p1

    .line 160
    :cond_4
    return v2
.end method

.method public final t0(Lj0/m;Lm0/c;)V
    .locals 5

    .line 1
    iget-object v0, p0, LB0/n0;->V:LB0/s0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, LB0/s0;->g(Lj0/m;Lm0/c;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-wide v0, p0, LB0/n0;->M:J

    .line 10
    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    shr-long v2, v0, v2

    .line 14
    .line 15
    long-to-int v2, v2

    .line 16
    int-to-float v2, v2

    .line 17
    const-wide v3, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr v0, v3

    .line 23
    long-to-int v0, v0

    .line 24
    int-to-float v0, v0

    .line 25
    invoke-interface {p1, v2, v0}, Lj0/m;->h(FF)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, LB0/n0;->u0(Lj0/m;Lm0/c;)V

    .line 29
    .line 30
    .line 31
    neg-float p2, v2

    .line 32
    neg-float v0, v0

    .line 33
    invoke-interface {p1, p2, v0}, Lj0/m;->h(FF)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final u0(Lj0/m;Lm0/c;)V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, LB0/n0;->C0(I)Lc0/l;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, LB0/n0;->Q0(Lj0/m;Lm0/c;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v2, p0, LB0/n0;->B:LB0/L;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, LB0/O;->a(LB0/L;)LB0/t0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, LC0/A;

    .line 22
    .line 23
    invoke-virtual {v2}, LC0/A;->getSharedDrawScope()LB0/N;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-wide v4, p0, Lz0/J;->s:J

    .line 28
    .line 29
    invoke-static {v4, v5}, Lcom/google/android/gms/internal/measurement/P1;->d0(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    move-object v10, v2

    .line 38
    :goto_0
    if-eqz v1, :cond_8

    .line 39
    .line 40
    instance-of v4, v1, LB0/p;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    move-object v8, v1

    .line 45
    check-cast v8, LB0/p;

    .line 46
    .line 47
    move-object v7, p0

    .line 48
    move-object v4, p1

    .line 49
    move-object v9, p2

    .line 50
    invoke-virtual/range {v3 .. v9}, LB0/N;->c(Lj0/m;JLB0/n0;LB0/p;Lm0/c;)V

    .line 51
    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_1
    move-object v4, p1

    .line 55
    move-object v9, p2

    .line 56
    iget p1, v1, Lc0/l;->s:I

    .line 57
    .line 58
    and-int/2addr p1, v0

    .line 59
    if-eqz p1, :cond_7

    .line 60
    .line 61
    instance-of p1, v1, LB0/n;

    .line 62
    .line 63
    if-eqz p1, :cond_7

    .line 64
    .line 65
    move-object p1, v1

    .line 66
    check-cast p1, LB0/n;

    .line 67
    .line 68
    iget-object p1, p1, LB0/n;->F:Lc0/l;

    .line 69
    .line 70
    const/4 p2, 0x0

    .line 71
    :goto_1
    const/4 v7, 0x1

    .line 72
    if-eqz p1, :cond_6

    .line 73
    .line 74
    iget v8, p1, Lc0/l;->s:I

    .line 75
    .line 76
    and-int/2addr v8, v0

    .line 77
    if-eqz v8, :cond_5

    .line 78
    .line 79
    add-int/lit8 p2, p2, 0x1

    .line 80
    .line 81
    if-ne p2, v7, :cond_2

    .line 82
    .line 83
    move-object v1, p1

    .line 84
    goto :goto_2

    .line 85
    :cond_2
    if-nez v10, :cond_3

    .line 86
    .line 87
    new-instance v10, LR/e;

    .line 88
    .line 89
    const/16 v7, 0x10

    .line 90
    .line 91
    new-array v7, v7, [Lc0/l;

    .line 92
    .line 93
    invoke-direct {v10, v7}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    if-eqz v1, :cond_4

    .line 97
    .line 98
    invoke-virtual {v10, v1}, LR/e;->c(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    move-object v1, v2

    .line 102
    :cond_4
    invoke-virtual {v10, p1}, LR/e;->c(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_5
    :goto_2
    iget-object p1, p1, Lc0/l;->v:Lc0/l;

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_6
    if-ne p2, v7, :cond_7

    .line 109
    .line 110
    :goto_3
    move-object p1, v4

    .line 111
    move-object p2, v9

    .line 112
    goto :goto_0

    .line 113
    :cond_7
    :goto_4
    invoke-static {v10}, LB0/g;->f(LR/e;)Lc0/l;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    goto :goto_3

    .line 118
    :cond_8
    return-void
.end method

.method public abstract v0()V
.end method

.method public final w0(LB0/n0;)LB0/n0;
    .locals 5

    .line 1
    iget-object v0, p1, LB0/n0;->B:LB0/L;

    .line 2
    .line 3
    iget-object v1, p0, LB0/n0;->B:LB0/L;

    .line 4
    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, LB0/n0;->B0()Lc0/l;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, LB0/n0;->B0()Lc0/l;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v1, Lc0/l;->q:Lc0/l;

    .line 16
    .line 17
    iget-boolean v2, v2, Lc0/l;->D:Z

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    const-string v2, "visitLocalAncestors called on an unattached node"

    .line 22
    .line 23
    invoke-static {v2}, Ly0/a;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v1, v1, Lc0/l;->q:Lc0/l;

    .line 27
    .line 28
    iget-object v1, v1, Lc0/l;->u:Lc0/l;

    .line 29
    .line 30
    :goto_0
    if-eqz v1, :cond_7

    .line 31
    .line 32
    iget v2, v1, Lc0/l;->s:I

    .line 33
    .line 34
    and-int/lit8 v2, v2, 0x2

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    if-ne v1, v0, :cond_1

    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_1
    iget-object v1, v1, Lc0/l;->u:Lc0/l;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    iget v2, v0, LB0/L;->F:I

    .line 45
    .line 46
    iget v3, v1, LB0/L;->F:I

    .line 47
    .line 48
    if-le v2, v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0}, LB0/L;->s()LB0/L;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move-object v2, v1

    .line 59
    :goto_2
    iget v3, v2, LB0/L;->F:I

    .line 60
    .line 61
    iget v4, v0, LB0/L;->F:I

    .line 62
    .line 63
    if-le v3, v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v2}, LB0/L;->s()LB0/L;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v2}, Lkotlin/jvm/internal/m;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    :goto_3
    if-eq v0, v2, :cond_6

    .line 74
    .line 75
    invoke-virtual {v0}, LB0/L;->s()LB0/L;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v2}, LB0/L;->s()LB0/L;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 89
    .line 90
    const-string v0, "layouts are not part of the same hierarchy"

    .line 91
    .line 92
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :cond_6
    if-ne v2, v1, :cond_8

    .line 97
    .line 98
    :cond_7
    return-object p0

    .line 99
    :cond_8
    iget-object v1, p1, LB0/n0;->B:LB0/L;

    .line 100
    .line 101
    if-ne v0, v1, :cond_9

    .line 102
    .line 103
    :goto_4
    return-object p1

    .line 104
    :cond_9
    iget-object p1, v0, LB0/L;->U:LB0/g0;

    .line 105
    .line 106
    iget-object p1, p1, LB0/g0;->b:LB0/v;

    .line 107
    .line 108
    return-object p1
.end method

.method public final x()Z
    .locals 1

    .line 1
    iget-object v0, p0, LB0/n0;->V:LB0/s0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, LB0/n0;->E:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LB0/n0;->B:LB0/L;

    .line 10
    .line 11
    invoke-virtual {v0}, LB0/L;->F()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method

.method public final x0(J)J
    .locals 6

    .line 1
    iget-wide v0, p0, LB0/n0;->M:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    shr-long v3, p1, v2

    .line 6
    .line 7
    long-to-int v3, v3

    .line 8
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    shr-long v4, v0, v2

    .line 13
    .line 14
    long-to-int v4, v4

    .line 15
    int-to-float v4, v4

    .line 16
    sub-float/2addr v3, v4

    .line 17
    const-wide v4, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr p1, v4

    .line 23
    long-to-int p1, p1

    .line 24
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-long/2addr v0, v4

    .line 29
    long-to-int p2, v0

    .line 30
    int-to-float p2, p2

    .line 31
    sub-float/2addr p1, p2

    .line 32
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    int-to-long v0, p2

    .line 37
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    int-to-long p1, p1

    .line 42
    shl-long/2addr v0, v2

    .line 43
    and-long/2addr p1, v4

    .line 44
    or-long/2addr p1, v0

    .line 45
    iget-object v0, p0, LB0/n0;->V:LB0/s0;

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-interface {v0, v1, p1, p2}, LB0/s0;->f(ZJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide p1

    .line 54
    :cond_0
    return-wide p1
.end method

.method public final y0()LB5/e;
    .locals 3

    .line 1
    iget-object v0, p0, LB0/n0;->S:LB0/j0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LB0/k0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v0, p0, v1}, LB0/k0;-><init>(LB0/n0;I)V

    .line 9
    .line 10
    .line 11
    new-instance v1, LB0/j0;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, v2, p0, v0}, LB0/j0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, LB0/n0;->S:LB0/j0;

    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    return-object v0
.end method

.method public abstract z0()LB0/U;
.end method
