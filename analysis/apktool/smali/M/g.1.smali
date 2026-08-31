.class public final LM/g;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Lc0/m;

.field public final synthetic r:Lj0/E;

.field public final synthetic s:LM/e;

.field public final synthetic t:LM/f;

.field public final synthetic u:LX/e;

.field public final synthetic v:I

.field public final synthetic w:I


# direct methods
.method public constructor <init>(Lc0/m;Lj0/E;LM/e;LM/f;LX/e;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LM/g;->q:Lc0/m;

    .line 2
    .line 3
    iput-object p2, p0, LM/g;->r:Lj0/E;

    .line 4
    .line 5
    iput-object p3, p0, LM/g;->s:LM/e;

    .line 6
    .line 7
    iput-object p4, p0, LM/g;->t:LM/f;

    .line 8
    .line 9
    iput-object p5, p0, LM/g;->u:LX/e;

    .line 10
    .line 11
    iput p6, p0, LM/g;->v:I

    .line 12
    .line 13
    iput p7, p0, LM/g;->w:I

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, LM/g;->v:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, LP/b;->w(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget v7, p0, LM/g;->w:I

    .line 18
    .line 19
    iget-object v0, p0, LM/g;->q:Lc0/m;

    .line 20
    .line 21
    iget-object v1, p0, LM/g;->r:Lj0/E;

    .line 22
    .line 23
    iget-object v2, p0, LM/g;->s:LM/e;

    .line 24
    .line 25
    iget-object v3, p0, LM/g;->t:LM/f;

    .line 26
    .line 27
    iget-object v4, p0, LM/g;->u:LX/e;

    .line 28
    .line 29
    invoke-static/range {v0 .. v7}, LM/s0;->a(Lc0/m;Lj0/E;LM/e;LM/f;LX/e;LP/o;II)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 33
    .line 34
    return-object p1
.end method
