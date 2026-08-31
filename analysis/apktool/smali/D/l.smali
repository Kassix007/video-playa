.class public final LD/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE/D;


# instance fields
.field public final a:LD/i;

.field public final b:LE/A;

.field public final c:I

.field public final synthetic d:LE/A;

.field public final synthetic e:LD/y;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:J


# direct methods
.method public constructor <init>(LD/i;LE/A;ILD/y;IIJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LD/l;->d:LE/A;

    .line 5
    .line 6
    iput-object p4, p0, LD/l;->e:LD/y;

    .line 7
    .line 8
    iput p5, p0, LD/l;->f:I

    .line 9
    .line 10
    iput p6, p0, LD/l;->g:I

    .line 11
    .line 12
    iput-wide p7, p0, LD/l;->h:J

    .line 13
    .line 14
    iput-object p1, p0, LD/l;->a:LD/i;

    .line 15
    .line 16
    iput-object p2, p0, LD/l;->b:LE/A;

    .line 17
    .line 18
    iput p3, p0, LD/l;->c:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(IIIIJ)LD/p;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    iget-object v1, v0, LD/l;->a:LD/i;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, LD/i;->b(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-object v1, v1, LD/i;->b:LD/h;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, LE/C;->j(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v12

    .line 17
    iget-object v1, v0, LD/l;->b:LE/A;

    .line 18
    .line 19
    move-wide/from16 v14, p5

    .line 20
    .line 21
    invoke-virtual {v1, v2, v14, v15}, LE/A;->a(IJ)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v9

    .line 25
    invoke-static {v14, v15}, LW0/a;->f(J)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-static {v14, v15}, LW0/a;->j(J)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    :goto_0
    move v4, v1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    invoke-static {v14, v15}, LW0/a;->e(J)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    const-string v1, "does not have fixed height"

    .line 44
    .line 45
    invoke-static {v1}, Lz/a;->a(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-static {v14, v15}, LW0/a;->i(J)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    goto :goto_0

    .line 53
    :goto_1
    iget-object v1, v0, LD/l;->d:LE/A;

    .line 54
    .line 55
    iget-object v1, v1, LE/A;->r:Lz0/T;

    .line 56
    .line 57
    invoke-interface {v1}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iget-object v1, v0, LD/l;->e:LD/y;

    .line 62
    .line 63
    iget-object v13, v1, LD/y;->m:Landroidx/compose/foundation/lazy/layout/b;

    .line 64
    .line 65
    new-instance v1, LD/p;

    .line 66
    .line 67
    iget v8, v0, LD/l;->g:I

    .line 68
    .line 69
    iget-wide v10, v0, LD/l;->h:J

    .line 70
    .line 71
    iget v7, v0, LD/l;->f:I

    .line 72
    .line 73
    move/from16 v16, p2

    .line 74
    .line 75
    move/from16 v17, p3

    .line 76
    .line 77
    move/from16 v5, p4

    .line 78
    .line 79
    invoke-direct/range {v1 .. v17}, LD/p;-><init>(ILjava/lang/Object;IILW0/l;IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/lazy/layout/b;JII)V

    .line 80
    .line 81
    .line 82
    return-object v1
.end method
