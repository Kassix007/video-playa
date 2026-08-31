.class final Landroidx/compose/ui/graphics/GraphicsLayerElement;
.super LB0/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LB0/d0;"
    }
.end annotation


# instance fields
.field public final q:F

.field public final r:F

.field public final s:J

.field public final t:Lj0/E;

.field public final u:Z

.field public final v:J

.field public final w:J


# direct methods
.method public constructor <init>(FFJLj0/E;ZJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->q:F

    .line 5
    .line 6
    iput p2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->r:F

    .line 7
    .line 8
    iput-wide p3, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->s:J

    .line 9
    .line 10
    iput-object p5, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->t:Lj0/E;

    .line 11
    .line 12
    iput-boolean p6, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->u:Z

    .line 13
    .line 14
    iput-wide p7, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->v:J

    .line 15
    .line 16
    iput-wide p9, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;

    if-nez v1, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_0

    :cond_2
    invoke-static {v1, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_0

    :cond_3
    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->q:F

    iget v2, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->q:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_0

    :cond_4
    const/4 v1, 0x0

    invoke-static {v1, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-eqz v2, :cond_5

    goto/16 :goto_0

    :cond_5
    invoke-static {v1, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_0

    :cond_6
    iget v2, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->r:F

    iget v3, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->r:F

    invoke-static {v2, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-eqz v2, :cond_7

    goto :goto_0

    :cond_7
    invoke-static {v1, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_0

    :cond_8
    invoke-static {v1, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_0

    :cond_9
    invoke-static {v1, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_0

    :cond_a
    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v1, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_0

    :cond_b
    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->s:J

    iget-wide v3, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->s:J

    invoke-static {v1, v2, v3, v4}, Lj0/H;->a(JJ)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_0

    :cond_c
    iget-object v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->t:Lj0/E;

    iget-object v2, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->t:Lj0/E;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_0

    :cond_d
    iget-boolean v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->u:Z

    iget-boolean v2, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->u:Z

    if-eq v1, v2, :cond_e

    goto :goto_0

    :cond_e
    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->v:J

    iget-wide v3, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->v:J

    invoke-static {v1, v2, v3, v4}, Lj0/o;->c(JJ)Z

    move-result v1

    if-nez v1, :cond_f

    goto :goto_0

    :cond_f
    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:J

    iget-wide v3, p1, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:J

    invoke-static {v1, v2, v3, v4}, Lj0/o;->c(JJ)Z

    move-result p1

    if-nez p1, :cond_10

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_10
    return v0
.end method

.method public final f()Lc0/l;
    .locals 3

    .line 1
    new-instance v0, Lj0/F;

    .line 2
    .line 3
    invoke-direct {v0}, Lc0/l;-><init>()V

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    iput v1, v0, Lj0/F;->E:F

    .line 9
    .line 10
    iput v1, v0, Lj0/F;->F:F

    .line 11
    .line 12
    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->q:F

    .line 13
    .line 14
    iput v1, v0, Lj0/F;->G:F

    .line 15
    .line 16
    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->r:F

    .line 17
    .line 18
    iput v1, v0, Lj0/F;->H:F

    .line 19
    .line 20
    const/high16 v1, 0x41000000    # 8.0f

    .line 21
    .line 22
    iput v1, v0, Lj0/F;->I:F

    .line 23
    .line 24
    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->s:J

    .line 25
    .line 26
    iput-wide v1, v0, Lj0/F;->J:J

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->t:Lj0/E;

    .line 29
    .line 30
    iput-object v1, v0, Lj0/F;->K:Lj0/E;

    .line 31
    .line 32
    iget-boolean v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->u:Z

    .line 33
    .line 34
    iput-boolean v1, v0, Lj0/F;->L:Z

    .line 35
    .line 36
    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->v:J

    .line 37
    .line 38
    iput-wide v1, v0, Lj0/F;->M:J

    .line 39
    .line 40
    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:J

    .line 41
    .line 42
    iput-wide v1, v0, Lj0/F;->N:J

    .line 43
    .line 44
    new-instance v1, LB0/a;

    .line 45
    .line 46
    const/16 v2, 0x1d

    .line 47
    .line 48
    invoke-direct {v1, v2, v0}, LB0/a;-><init>(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput-object v1, v0, Lj0/F;->O:LB0/a;

    .line 52
    .line 53
    return-object v0
.end method

.method public final g(Lc0/l;)V
    .locals 2

    .line 1
    check-cast p1, Lj0/F;

    .line 2
    .line 3
    const/high16 v0, 0x3f800000    # 1.0f

    .line 4
    .line 5
    iput v0, p1, Lj0/F;->E:F

    .line 6
    .line 7
    iput v0, p1, Lj0/F;->F:F

    .line 8
    .line 9
    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->q:F

    .line 10
    .line 11
    iput v0, p1, Lj0/F;->G:F

    .line 12
    .line 13
    iget v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->r:F

    .line 14
    .line 15
    iput v0, p1, Lj0/F;->H:F

    .line 16
    .line 17
    const/high16 v0, 0x41000000    # 8.0f

    .line 18
    .line 19
    iput v0, p1, Lj0/F;->I:F

    .line 20
    .line 21
    iget-wide v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->s:J

    .line 22
    .line 23
    iput-wide v0, p1, Lj0/F;->J:J

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->t:Lj0/E;

    .line 26
    .line 27
    iput-object v0, p1, Lj0/F;->K:Lj0/E;

    .line 28
    .line 29
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->u:Z

    .line 30
    .line 31
    iput-boolean v0, p1, Lj0/F;->L:Z

    .line 32
    .line 33
    iget-wide v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->v:J

    .line 34
    .line 35
    iput-wide v0, p1, Lj0/F;->M:J

    .line 36
    .line 37
    iget-wide v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:J

    .line 38
    .line 39
    iput-wide v0, p1, Lj0/F;->N:J

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    invoke-static {p1, v0}, LB0/g;->s(LB0/m;I)LB0/n0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v0, v0, LB0/n0;->C:LB0/n0;

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    iget-object p1, p1, Lj0/F;->O:LB0/a;

    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-virtual {v0, p1, v1}, LB0/n0;->U0(LB5/c;Z)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x1f

    .line 8
    .line 9
    mul-int/2addr v1, v2

    .line 10
    invoke-static {v0, v1, v2}, Lk1/i;->b(FII)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->q:F

    .line 15
    .line 16
    invoke-static {v1, v0, v2}, Lk1/i;->b(FII)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {v1, v0, v2}, Lk1/i;->b(FII)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-static {v1, v0, v2}, Lk1/i;->b(FII)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget v3, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->r:F

    .line 30
    .line 31
    invoke-static {v3, v0, v2}, Lk1/i;->b(FII)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {v1, v0, v2}, Lk1/i;->b(FII)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {v1, v0, v2}, Lk1/i;->b(FII)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-static {v1, v0, v2}, Lk1/i;->b(FII)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/high16 v1, 0x41000000    # 8.0f

    .line 48
    .line 49
    invoke-static {v1, v0, v2}, Lk1/i;->b(FII)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    sget v1, Lj0/H;->c:I

    .line 54
    .line 55
    iget-wide v3, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->s:J

    .line 56
    .line 57
    invoke-static {v0, v2, v3, v4}, Lk1/i;->d(IIJ)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-object v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->t:Lj0/E;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    add-int/2addr v1, v0

    .line 68
    mul-int/2addr v1, v2

    .line 69
    iget-boolean v0, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->u:Z

    .line 70
    .line 71
    const/16 v3, 0x3c1

    .line 72
    .line 73
    invoke-static {v1, v3, v0}, Lk1/i;->e(IIZ)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    sget v1, Lj0/o;->h:I

    .line 78
    .line 79
    iget-wide v3, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->v:J

    .line 80
    .line 81
    invoke-static {v0, v2, v3, v4}, Lk1/i;->d(IIJ)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-wide v3, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:J

    .line 86
    .line 87
    invoke-static {v0, v2, v3, v4}, Lk1/i;->d(IIJ)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    const/4 v1, 0x0

    .line 92
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    add-int/2addr v1, v0

    .line 97
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->q:F

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", translationX=0.0, translationY=0.0, shadowElevation="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->r:F

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->s:J

    .line 29
    .line 30
    invoke-static {v1, v2}, Lj0/H;->d(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", shape="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->t:Lj0/E;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v1, ", clip="

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    iget-boolean v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->u:Z

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", renderEffect=null, ambientShadowColor="

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->v:J

    .line 63
    .line 64
    const-string v3, ", spotShadowColor="

    .line 65
    .line 66
    invoke-static {v1, v2, v0, v3}, Lk1/i;->r(JLjava/lang/StringBuilder;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-wide v1, p0, Landroidx/compose/ui/graphics/GraphicsLayerElement;->w:J

    .line 70
    .line 71
    invoke-static {v1, v2}, Lj0/o;->i(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v1, ", compositingStrategy=CompositingStrategy(value=0))"

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    return-object v0
.end method
