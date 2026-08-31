.class public final Ld6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final A:J

.field public final B:J

.field public final C:LL/s;

.field public D:Ld6/c;

.field public final q:Ld6/s;

.field public final r:Ld6/r;

.field public final s:Ljava/lang/String;

.field public final t:I

.field public final u:Ld6/k;

.field public final v:Ld6/l;

.field public final w:Ld6/w;

.field public final x:Ld6/u;

.field public final y:Ld6/u;

.field public final z:Ld6/u;


# direct methods
.method public constructor <init>(Ld6/s;Ld6/r;Ljava/lang/String;ILd6/k;Ld6/l;Ld6/w;Ld6/u;Ld6/u;Ld6/u;JJLL/s;)V
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "protocol"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "message"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ld6/u;->q:Ld6/s;

    .line 20
    .line 21
    iput-object p2, p0, Ld6/u;->r:Ld6/r;

    .line 22
    .line 23
    iput-object p3, p0, Ld6/u;->s:Ljava/lang/String;

    .line 24
    .line 25
    iput p4, p0, Ld6/u;->t:I

    .line 26
    .line 27
    iput-object p5, p0, Ld6/u;->u:Ld6/k;

    .line 28
    .line 29
    iput-object p6, p0, Ld6/u;->v:Ld6/l;

    .line 30
    .line 31
    iput-object p7, p0, Ld6/u;->w:Ld6/w;

    .line 32
    .line 33
    iput-object p8, p0, Ld6/u;->x:Ld6/u;

    .line 34
    .line 35
    iput-object p9, p0, Ld6/u;->y:Ld6/u;

    .line 36
    .line 37
    iput-object p10, p0, Ld6/u;->z:Ld6/u;

    .line 38
    .line 39
    iput-wide p11, p0, Ld6/u;->A:J

    .line 40
    .line 41
    iput-wide p13, p0, Ld6/u;->B:J

    .line 42
    .line 43
    move-object/from16 p1, p15

    .line 44
    .line 45
    iput-object p1, p0, Ld6/u;->C:LL/s;

    .line 46
    .line 47
    return-void
.end method

.method public static a(Ld6/u;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ld6/u;->v:Ld6/l;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ld6/l;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    :cond_0
    return-object p0
.end method


# virtual methods
.method public final b()Ld6/t;
    .locals 3

    .line 1
    new-instance v0, Ld6/t;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ld6/u;->q:Ld6/s;

    .line 7
    .line 8
    iput-object v1, v0, Ld6/t;->a:Ld6/s;

    .line 9
    .line 10
    iget-object v1, p0, Ld6/u;->r:Ld6/r;

    .line 11
    .line 12
    iput-object v1, v0, Ld6/t;->b:Ld6/r;

    .line 13
    .line 14
    iget v1, p0, Ld6/u;->t:I

    .line 15
    .line 16
    iput v1, v0, Ld6/t;->c:I

    .line 17
    .line 18
    iget-object v1, p0, Ld6/u;->s:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v1, v0, Ld6/t;->d:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p0, Ld6/u;->u:Ld6/k;

    .line 23
    .line 24
    iput-object v1, v0, Ld6/t;->e:Ld6/k;

    .line 25
    .line 26
    iget-object v1, p0, Ld6/u;->v:Ld6/l;

    .line 27
    .line 28
    invoke-virtual {v1}, Ld6/l;->h()Lc3/c;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, v0, Ld6/t;->f:Lc3/c;

    .line 33
    .line 34
    iget-object v1, p0, Ld6/u;->w:Ld6/w;

    .line 35
    .line 36
    iput-object v1, v0, Ld6/t;->g:Ld6/w;

    .line 37
    .line 38
    iget-object v1, p0, Ld6/u;->x:Ld6/u;

    .line 39
    .line 40
    iput-object v1, v0, Ld6/t;->h:Ld6/u;

    .line 41
    .line 42
    iget-object v1, p0, Ld6/u;->y:Ld6/u;

    .line 43
    .line 44
    iput-object v1, v0, Ld6/t;->i:Ld6/u;

    .line 45
    .line 46
    iget-object v1, p0, Ld6/u;->z:Ld6/u;

    .line 47
    .line 48
    iput-object v1, v0, Ld6/t;->j:Ld6/u;

    .line 49
    .line 50
    iget-wide v1, p0, Ld6/u;->A:J

    .line 51
    .line 52
    iput-wide v1, v0, Ld6/t;->k:J

    .line 53
    .line 54
    iget-wide v1, p0, Ld6/u;->B:J

    .line 55
    .line 56
    iput-wide v1, v0, Ld6/t;->l:J

    .line 57
    .line 58
    iget-object v1, p0, Ld6/u;->C:LL/s;

    .line 59
    .line 60
    iput-object v1, v0, Ld6/t;->m:LL/s;

    .line 61
    .line 62
    return-object v0
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Ld6/u;->w:Ld6/w;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ld6/w;->close()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v1, "response is not eligible for a body and must not be closed"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Response{protocol="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ld6/u;->r:Ld6/r;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", code="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Ld6/u;->t:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", message="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ld6/u;->s:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", url="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Ld6/u;->q:Ld6/s;

    .line 39
    .line 40
    iget-object v1, v1, Ld6/s;->a:Ld6/n;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const/16 v1, 0x7d

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0
.end method
