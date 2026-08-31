.class public final synthetic LZ4/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Lcom/web2native/MainActivity;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:J

.field public final synthetic u:LZ4/M;

.field public final synthetic v:LB5/c;

.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;JLZ4/M;LB5/c;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ4/w;->q:Lcom/web2native/MainActivity;

    iput-object p2, p0, LZ4/w;->r:Ljava/lang/String;

    iput-object p3, p0, LZ4/w;->s:Ljava/lang/String;

    iput-wide p4, p0, LZ4/w;->t:J

    iput-object p6, p0, LZ4/w;->u:LZ4/M;

    iput-object p7, p0, LZ4/w;->v:LB5/c;

    iput p8, p0, LZ4/w;->w:I

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
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, LZ4/w;->w:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, LP/b;->w(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, LZ4/w;->q:Lcom/web2native/MainActivity;

    .line 18
    .line 19
    iget-object v1, p0, LZ4/w;->r:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, LZ4/w;->s:Ljava/lang/String;

    .line 22
    .line 23
    iget-wide v3, p0, LZ4/w;->t:J

    .line 24
    .line 25
    iget-object v5, p0, LZ4/w;->u:LZ4/M;

    .line 26
    .line 27
    iget-object v6, p0, LZ4/w;->v:LB5/c;

    .line 28
    .line 29
    invoke-static/range {v0 .. v8}, LZ4/L;->g(Lcom/web2native/MainActivity;Ljava/lang/String;Ljava/lang/String;JLZ4/M;LB5/c;LP/o;I)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 33
    .line 34
    return-object p1
.end method
