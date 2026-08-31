.class public final LC/b;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Lc0/m;

.field public final synthetic r:LC/A;

.field public final synthetic s:LA/L;

.field public final synthetic t:LA/g;

.field public final synthetic u:Lc0/c;

.field public final synthetic v:Lw/I;

.field public final synthetic w:Z

.field public final synthetic x:Lv/l;

.field public final synthetic y:LB5/c;


# direct methods
.method public constructor <init>(Lc0/m;LC/A;LA/L;LA/g;Lc0/c;Lw/I;ZLv/l;LB5/c;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LC/b;->q:Lc0/m;

    .line 2
    .line 3
    iput-object p2, p0, LC/b;->r:LC/A;

    .line 4
    .line 5
    iput-object p3, p0, LC/b;->s:LA/L;

    .line 6
    .line 7
    iput-object p4, p0, LC/b;->t:LA/g;

    .line 8
    .line 9
    iput-object p5, p0, LC/b;->u:Lc0/c;

    .line 10
    .line 11
    iput-object p6, p0, LC/b;->v:Lw/I;

    .line 12
    .line 13
    iput-boolean p7, p0, LC/b;->w:Z

    .line 14
    .line 15
    iput-object p8, p0, LC/b;->x:Lv/l;

    .line 16
    .line 17
    iput-object p9, p0, LC/b;->y:LB5/c;

    .line 18
    .line 19
    const/4 p1, 0x2

    .line 20
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x7

    .line 10
    invoke-static {p1}, LP/b;->w(I)I

    .line 11
    .line 12
    .line 13
    move-result v10

    .line 14
    iget-object v0, p0, LC/b;->q:Lc0/m;

    .line 15
    .line 16
    iget-object v1, p0, LC/b;->r:LC/A;

    .line 17
    .line 18
    iget-object v2, p0, LC/b;->s:LA/L;

    .line 19
    .line 20
    iget-object v3, p0, LC/b;->t:LA/g;

    .line 21
    .line 22
    iget-object v4, p0, LC/b;->u:Lc0/c;

    .line 23
    .line 24
    iget-object v5, p0, LC/b;->v:Lw/I;

    .line 25
    .line 26
    iget-boolean v6, p0, LC/b;->w:Z

    .line 27
    .line 28
    iget-object v7, p0, LC/b;->x:Lv/l;

    .line 29
    .line 30
    iget-object v8, p0, LC/b;->y:LB5/c;

    .line 31
    .line 32
    invoke-static/range {v0 .. v10}, Ln5/A;->d(Lc0/m;LC/A;LA/L;LA/g;Lc0/c;Lw/I;ZLv/l;LB5/c;LP/o;I)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 36
    .line 37
    return-object p1
.end method
