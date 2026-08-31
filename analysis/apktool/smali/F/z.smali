.class public final LF/z;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:LE/A;

.field public final synthetic s:J

.field public final synthetic t:LF/x;

.field public final synthetic u:J

.field public final synthetic v:Lc0/d;

.field public final synthetic w:I


# direct methods
.method public constructor <init>(LE/A;JLF/x;JLc0/d;II)V
    .locals 1

    .line 1
    iput p9, p0, LF/z;->q:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    packed-switch p9, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, LF/z;->r:LE/A;

    .line 8
    .line 9
    iput-wide p2, p0, LF/z;->s:J

    .line 10
    .line 11
    iput-object p4, p0, LF/z;->t:LF/x;

    .line 12
    .line 13
    iput-wide p5, p0, LF/z;->u:J

    .line 14
    .line 15
    iput-object p7, p0, LF/z;->v:Lc0/d;

    .line 16
    .line 17
    iput p8, p0, LF/z;->w:I

    .line 18
    .line 19
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    iput-object p1, p0, LF/z;->r:LE/A;

    .line 24
    .line 25
    iput-wide p2, p0, LF/z;->s:J

    .line 26
    .line 27
    iput-object p4, p0, LF/z;->t:LF/x;

    .line 28
    .line 29
    iput-wide p5, p0, LF/z;->u:J

    .line 30
    .line 31
    iput-object p7, p0, LF/z;->v:Lc0/d;

    .line 32
    .line 33
    iput p8, p0, LF/z;->w:I

    .line 34
    .line 35
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, LF/z;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sget-object v8, Lc0/b;->C:Lc0/c;

    .line 13
    .line 14
    iget-object v0, p0, LF/z;->r:LE/A;

    .line 15
    .line 16
    iget-object p1, v0, LE/A;->r:Lz0/T;

    .line 17
    .line 18
    invoke-interface {p1}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 19
    .line 20
    .line 21
    move-result-object v10

    .line 22
    const/4 v11, 0x0

    .line 23
    iget v12, p0, LF/z;->w:I

    .line 24
    .line 25
    iget-wide v2, p0, LF/z;->s:J

    .line 26
    .line 27
    iget-object v4, p0, LF/z;->t:LF/x;

    .line 28
    .line 29
    iget-wide v5, p0, LF/z;->u:J

    .line 30
    .line 31
    sget-object v7, Lw/d0;->r:Lw/d0;

    .line 32
    .line 33
    iget-object v9, p0, LF/z;->v:Lc0/d;

    .line 34
    .line 35
    invoke-static/range {v0 .. v12}, La/a;->z(LE/A;IJLF/x;JLw/d0;Lc0/c;Lc0/d;LW0/l;ZI)LF/l;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    :pswitch_0
    check-cast p1, Ljava/lang/Number;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    sget-object v8, Lc0/b;->C:Lc0/c;

    .line 47
    .line 48
    iget-object v0, p0, LF/z;->r:LE/A;

    .line 49
    .line 50
    iget-object p1, v0, LE/A;->r:Lz0/T;

    .line 51
    .line 52
    invoke-interface {p1}, Lz0/E;->getLayoutDirection()LW0/l;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    const/4 v11, 0x0

    .line 57
    iget v12, p0, LF/z;->w:I

    .line 58
    .line 59
    iget-wide v2, p0, LF/z;->s:J

    .line 60
    .line 61
    iget-object v4, p0, LF/z;->t:LF/x;

    .line 62
    .line 63
    iget-wide v5, p0, LF/z;->u:J

    .line 64
    .line 65
    sget-object v7, Lw/d0;->r:Lw/d0;

    .line 66
    .line 67
    iget-object v9, p0, LF/z;->v:Lc0/d;

    .line 68
    .line 69
    invoke-static/range {v0 .. v12}, La/a;->z(LE/A;IJLF/x;JLw/d0;Lc0/c;Lc0/d;LW0/l;ZI)LF/l;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
