.class public final Lu2/n;
.super Lo0/b;
.source "SourceFile"

# interfaces
.implements LP/w0;


# static fields
.field public static final J:LZ4/G;


# instance fields
.field public A:Lu2/g;

.field public B:Lo0/b;

.field public C:LB5/c;

.field public D:Lz0/j;

.field public E:I

.field public F:Z

.field public final G:LP/f0;

.field public final H:LP/f0;

.field public final I:LP/f0;

.field public v:LR5/d;

.field public final w:LP5/S;

.field public final x:LP/f0;

.field public final y:LP/b0;

.field public final z:LP/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LZ4/G;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, LZ4/G;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lu2/n;->J:LZ4/G;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(LD2/j;Lt2/l;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lo0/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Li0/e;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Li0/e;-><init>(J)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, LP5/H;->b(Ljava/lang/Object;)LP5/S;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lu2/n;->w:LP5/S;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {v0}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, p0, Lu2/n;->x:LP/f0;

    .line 23
    .line 24
    new-instance v1, LP/b0;

    .line 25
    .line 26
    const/high16 v2, 0x3f800000    # 1.0f

    .line 27
    .line 28
    invoke-direct {v1, v2}, LP/b0;-><init>(F)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lu2/n;->y:LP/b0;

    .line 32
    .line 33
    invoke-static {v0}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lu2/n;->z:LP/f0;

    .line 38
    .line 39
    sget-object v0, Lu2/c;->a:Lu2/c;

    .line 40
    .line 41
    iput-object v0, p0, Lu2/n;->A:Lu2/g;

    .line 42
    .line 43
    sget-object v1, Lu2/n;->J:LZ4/G;

    .line 44
    .line 45
    iput-object v1, p0, Lu2/n;->C:LB5/c;

    .line 46
    .line 47
    sget-object v1, Lz0/i;->a:Lz0/F;

    .line 48
    .line 49
    iput-object v1, p0, Lu2/n;->D:Lz0/j;

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    iput v1, p0, Lu2/n;->E:I

    .line 53
    .line 54
    invoke-static {v0}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lu2/n;->G:LP/f0;

    .line 59
    .line 60
    invoke-static {p1}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iput-object p1, p0, Lu2/n;->H:LP/f0;

    .line 65
    .line 66
    invoke-static {p2}, LP/b;->q(Ljava/lang/Object;)LP/f0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, Lu2/n;->I:LP/f0;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final a(F)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/n;->y:LP/b0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/b0;->f(F)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1
.end method

.method public final b()V
    .locals 4

    .line 1
    const-string v0, "AsyncImagePainter.onRemembered"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lu2/n;->v:LR5/d;

    .line 7
    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    invoke-static {}, LM5/y;->c()LM5/q0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, LM5/H;->a:LT5/e;

    .line 15
    .line 16
    sget-object v1, LR5/n;->a:LN5/f;

    .line 17
    .line 18
    iget-object v1, v1, LN5/f;->t:LN5/f;

    .line 19
    .line 20
    invoke-static {v0, v1}, LE3/h;->L(Lq5/f;Lq5/h;)Lq5/h;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, LM5/y;->a(Lq5/h;)LR5/d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Lu2/n;->v:LR5/d;

    .line 29
    .line 30
    iget-object v1, p0, Lu2/n;->B:Lo0/b;

    .line 31
    .line 32
    instance-of v2, v1, LP/w0;

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    check-cast v1, LP/w0;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto :goto_2

    .line 42
    :cond_0
    move-object v1, v3

    .line 43
    :goto_0
    if-eqz v1, :cond_1

    .line 44
    .line 45
    invoke-interface {v1}, LP/w0;->b()V

    .line 46
    .line 47
    .line 48
    :cond_1
    iget-boolean v1, p0, Lu2/n;->F:Z

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    iget-object v0, p0, Lu2/n;->H:LP/f0;

    .line 53
    .line 54
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, LD2/j;

    .line 59
    .line 60
    invoke-static {v0}, LD2/j;->a(LD2/j;)LD2/h;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object v1, p0, Lu2/n;->I:LP/f0;

    .line 65
    .line 66
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lt2/l;

    .line 71
    .line 72
    iget-object v1, v1, Lt2/l;->b:LD2/c;

    .line 73
    .line 74
    iput-object v1, v0, LD2/h;->b:LD2/c;

    .line 75
    .line 76
    iput-object v3, v0, LD2/h;->q:LE2/g;

    .line 77
    .line 78
    invoke-virtual {v0}, LD2/h;->a()LD2/j;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v1, Lu2/e;

    .line 83
    .line 84
    iget-object v0, v0, LD2/j;->A:LD2/c;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    sget-object v0, LH2/d;->a:LD2/c;

    .line 90
    .line 91
    invoke-direct {v1, v3}, Lu2/e;-><init>(Lo0/b;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v1}, Lu2/n;->k(Lu2/g;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_2
    new-instance v1, Lu2/j;

    .line 99
    .line 100
    invoke-direct {v1, p0, v3}, Lu2/j;-><init>(Lu2/n;Lq5/c;)V

    .line 101
    .line 102
    .line 103
    const/4 v2, 0x3

    .line 104
    invoke-static {v0, v3, v3, v1, v2}, LM5/y;->t(LM5/w;Lq5/h;LM5/x;LB5/e;I)LM5/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    :cond_3
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :goto_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 112
    .line 113
    .line 114
    throw v0
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/n;->v:LR5/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {v0, v1}, LM5/y;->e(LM5/w;Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, Lu2/n;->v:LR5/d;

    .line 10
    .line 11
    iget-object v0, p0, Lu2/n;->B:Lo0/b;

    .line 12
    .line 13
    instance-of v2, v0, LP/w0;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, LP/w0;

    .line 19
    .line 20
    :cond_1
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, LP/w0;->c()V

    .line 23
    .line 24
    .line 25
    :cond_2
    return-void
.end method

.method public final d(Lj0/j;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/n;->z:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    return p1
.end method

.method public final e()V
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/n;->v:LR5/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-static {v0, v1}, LM5/y;->e(LM5/w;Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, Lu2/n;->v:LR5/d;

    .line 10
    .line 11
    iget-object v0, p0, Lu2/n;->B:Lo0/b;

    .line 12
    .line 13
    instance-of v2, v0, LP/w0;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, LP/w0;

    .line 19
    .line 20
    :cond_1
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, LP/w0;->e()V

    .line 23
    .line 24
    .line 25
    :cond_2
    return-void
.end method

.method public final h()J
    .locals 2

    .line 1
    iget-object v0, p0, Lu2/n;->x:LP/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lo0/b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lo0/b;->h()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    return-wide v0
.end method

.method public final i(LB0/N;)V
    .locals 8

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
    new-instance v3, Li0/e;

    .line 8
    .line 9
    invoke-direct {v3, v1, v2}, Li0/e;-><init>(J)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lu2/n;->w:LP5/S;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v1, v2, v3}, LP5/S;->h(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lu2/n;->x:LP/f0;

    .line 22
    .line 23
    invoke-virtual {v1}, LP/f0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, Lo0/b;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-interface {v0}, Ll0/d;->d()J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    iget-object v0, p0, Lu2/n;->y:LP/b0;

    .line 37
    .line 38
    invoke-virtual {v0}, LP/b0;->e()F

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    iget-object v0, p0, Lu2/n;->z:LP/f0;

    .line 43
    .line 44
    invoke-virtual {v0}, LP/f0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    move-object v7, v0

    .line 49
    check-cast v7, Lj0/j;

    .line 50
    .line 51
    move-object v3, p1

    .line 52
    invoke-virtual/range {v2 .. v7}, Lo0/b;->g(LB0/N;JFLj0/j;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
.end method

.method public final j(Landroid/graphics/drawable/Drawable;)Lo0/b;
    .locals 8

    .line 1
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v0, Lj0/e;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lj0/e;-><init>(Landroid/graphics/Bitmap;)V

    .line 14
    .line 15
    .line 16
    iget v1, p0, Lu2/n;->E:I

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    int-to-long v2, v2

    .line 27
    const/16 v4, 0x20

    .line 28
    .line 29
    shl-long/2addr v2, v4

    .line 30
    int-to-long v4, p1

    .line 31
    const-wide v6, 0xffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    and-long/2addr v4, v6

    .line 37
    or-long/2addr v2, v4

    .line 38
    new-instance p1, Lo0/a;

    .line 39
    .line 40
    invoke-direct {p1, v0, v2, v3}, Lo0/a;-><init>(Lj0/e;J)V

    .line 41
    .line 42
    .line 43
    iput v1, p1, Lo0/a;->x:I

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_0
    new-instance v0, Lq3/b;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {v0, p1}, Lq3/b;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method public final k(Lu2/g;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lu2/n;->A:Lu2/g;

    .line 2
    .line 3
    iget-object v1, p0, Lu2/n;->C:LB5/c;

    .line 4
    .line 5
    invoke-interface {v1, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu2/g;

    .line 10
    .line 11
    iput-object p1, p0, Lu2/n;->A:Lu2/g;

    .line 12
    .line 13
    iget-object v1, p0, Lu2/n;->G:LP/f0;

    .line 14
    .line 15
    invoke-virtual {v1, p1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    instance-of v1, p1, Lu2/f;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    move-object v1, p1

    .line 23
    check-cast v1, Lu2/f;

    .line 24
    .line 25
    iget-object v1, v1, Lu2/f;->b:LD2/r;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    instance-of v1, p1, Lu2/d;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    move-object v1, p1

    .line 33
    check-cast v1, Lu2/d;

    .line 34
    .line 35
    iget-object v1, v1, Lu2/d;->b:LD2/e;

    .line 36
    .line 37
    :goto_0
    invoke-virtual {v1}, LD2/k;->a()LD2/j;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v1, v1, LD2/j;->h:LG2/a;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {p1}, Lu2/g;->a()Lo0/b;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iput-object v1, p0, Lu2/n;->B:Lo0/b;

    .line 51
    .line 52
    iget-object v2, p0, Lu2/n;->x:LP/f0;

    .line 53
    .line 54
    invoke-virtual {v2, v1}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lu2/n;->v:LR5/d;

    .line 58
    .line 59
    if-eqz v1, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0}, Lu2/g;->a()Lo0/b;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {p1}, Lu2/g;->a()Lo0/b;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-eq v1, v2, :cond_5

    .line 70
    .line 71
    invoke-virtual {v0}, Lu2/g;->a()Lo0/b;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    instance-of v1, v0, LP/w0;

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    if-eqz v1, :cond_2

    .line 79
    .line 80
    check-cast v0, LP/w0;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v0, v2

    .line 84
    :goto_1
    if-eqz v0, :cond_3

    .line 85
    .line 86
    invoke-interface {v0}, LP/w0;->e()V

    .line 87
    .line 88
    .line 89
    :cond_3
    invoke-virtual {p1}, Lu2/g;->a()Lo0/b;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    instance-of v0, p1, LP/w0;

    .line 94
    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    move-object v2, p1

    .line 98
    check-cast v2, LP/w0;

    .line 99
    .line 100
    :cond_4
    if-eqz v2, :cond_5

    .line 101
    .line 102
    invoke-interface {v2}, LP/w0;->b()V

    .line 103
    .line 104
    .line 105
    :cond_5
    return-void
.end method
