.class public final LM/l0;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Lc0/m;

.field public final synthetic r:J

.field public final synthetic s:F

.field public final synthetic t:J

.field public final synthetic u:I


# direct methods
.method public constructor <init>(Lc0/m;JFJII)V
    .locals 0

    .line 1
    iput-object p1, p0, LM/l0;->q:Lc0/m;

    .line 2
    .line 3
    iput-wide p2, p0, LM/l0;->r:J

    .line 4
    .line 5
    iput p4, p0, LM/l0;->s:F

    .line 6
    .line 7
    iput-wide p5, p0, LM/l0;->t:J

    .line 8
    .line 9
    iput p7, p0, LM/l0;->u:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    const/16 p1, 0x187

    .line 10
    .line 11
    invoke-static {p1}, LP/b;->w(I)I

    .line 12
    .line 13
    .line 14
    move-result v8

    .line 15
    iget-object v0, p0, LM/l0;->q:Lc0/m;

    .line 16
    .line 17
    iget-wide v1, p0, LM/l0;->r:J

    .line 18
    .line 19
    iget v3, p0, LM/l0;->s:F

    .line 20
    .line 21
    iget-wide v4, p0, LM/l0;->t:J

    .line 22
    .line 23
    iget v6, p0, LM/l0;->u:I

    .line 24
    .line 25
    invoke-static/range {v0 .. v8}, LM/q0;->a(Lc0/m;JFJILP/o;I)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 29
    .line 30
    return-object p1
.end method
