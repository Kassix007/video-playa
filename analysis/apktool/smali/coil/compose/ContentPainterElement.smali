.class public final Lcoil/compose/ContentPainterElement;
.super LB0/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LB0/d0;"
    }
.end annotation


# instance fields
.field public final q:Lo0/b;

.field public final r:Lc0/e;

.field public final s:Lz0/j;


# direct methods
.method public constructor <init>(Lu2/n;Lc0/e;Lz0/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcoil/compose/ContentPainterElement;->q:Lo0/b;

    .line 5
    .line 6
    iput-object p2, p0, Lcoil/compose/ContentPainterElement;->r:Lc0/e;

    .line 7
    .line 8
    iput-object p3, p0, Lcoil/compose/ContentPainterElement;->s:Lz0/j;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcoil/compose/ContentPainterElement;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lcoil/compose/ContentPainterElement;

    iget-object v0, p0, Lcoil/compose/ContentPainterElement;->q:Lo0/b;

    iget-object v1, p1, Lcoil/compose/ContentPainterElement;->q:Lo0/b;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcoil/compose/ContentPainterElement;->r:Lc0/e;

    iget-object v1, p1, Lcoil/compose/ContentPainterElement;->r:Lc0/e;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcoil/compose/ContentPainterElement;->s:Lz0/j;

    iget-object p1, p1, Lcoil/compose/ContentPainterElement;->s:Lz0/j;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_5

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_5
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final f()Lc0/l;
    .locals 2

    .line 1
    new-instance v0, Lu2/s;

    .line 2
    .line 3
    invoke-direct {v0}, Lc0/l;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcoil/compose/ContentPainterElement;->q:Lo0/b;

    .line 7
    .line 8
    iput-object v1, v0, Lu2/s;->E:Lo0/b;

    .line 9
    .line 10
    iget-object v1, p0, Lcoil/compose/ContentPainterElement;->r:Lc0/e;

    .line 11
    .line 12
    iput-object v1, v0, Lu2/s;->F:Lc0/e;

    .line 13
    .line 14
    iget-object v1, p0, Lcoil/compose/ContentPainterElement;->s:Lz0/j;

    .line 15
    .line 16
    iput-object v1, v0, Lu2/s;->G:Lz0/j;

    .line 17
    .line 18
    const/high16 v1, 0x3f800000    # 1.0f

    .line 19
    .line 20
    iput v1, v0, Lu2/s;->H:F

    .line 21
    .line 22
    return-object v0
.end method

.method public final g(Lc0/l;)V
    .locals 5

    .line 1
    check-cast p1, Lu2/s;

    .line 2
    .line 3
    iget-object v0, p1, Lu2/s;->E:Lo0/b;

    .line 4
    .line 5
    invoke-virtual {v0}, Lo0/b;->h()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    iget-object v2, p0, Lcoil/compose/ContentPainterElement;->q:Lo0/b;

    .line 10
    .line 11
    invoke-virtual {v2}, Lo0/b;->h()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    invoke-static {v0, v1, v3, v4}, Li0/e;->a(JJ)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput-object v2, p1, Lu2/s;->E:Lo0/b;

    .line 20
    .line 21
    iget-object v1, p0, Lcoil/compose/ContentPainterElement;->r:Lc0/e;

    .line 22
    .line 23
    iput-object v1, p1, Lu2/s;->F:Lc0/e;

    .line 24
    .line 25
    iget-object v1, p0, Lcoil/compose/ContentPainterElement;->s:Lz0/j;

    .line 26
    .line 27
    iput-object v1, p1, Lu2/s;->G:Lz0/j;

    .line 28
    .line 29
    const/high16 v1, 0x3f800000    # 1.0f

    .line 30
    .line 31
    iput v1, p1, Lu2/s;->H:F

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    invoke-static {p1}, LB0/g;->m(LB0/z;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-static {p1}, LB0/g;->l(LB0/p;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil/compose/ContentPainterElement;->q:Lo0/b;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lcoil/compose/ContentPainterElement;->r:Lc0/e;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lcoil/compose/ContentPainterElement;->s:Lz0/j;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    const/high16 v2, 0x3f800000    # 1.0f

    .line 27
    .line 28
    invoke-static {v2, v0, v1}, Lk1/i;->b(FII)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ContentPainterElement(painter="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcoil/compose/ContentPainterElement;->q:Lo0/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alignment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcoil/compose/ContentPainterElement;->r:Lc0/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcoil/compose/ContentPainterElement;->s:Lz0/j;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", alpha=1.0, colorFilter=null)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
