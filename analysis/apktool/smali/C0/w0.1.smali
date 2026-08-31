.class public final LC0/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ/i;


# instance fields
.field public final a:LC0/y0;

.field public final synthetic b:LZ/j;


# direct methods
.method public constructor <init>(LZ/j;LC0/y0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LC0/w0;->a:LC0/y0;

    .line 5
    .line 6
    iput-object p1, p0, LC0/w0;->b:LZ/j;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LC0/w0;->b:LZ/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ/j;->a(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final b()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/w0;->b:LZ/j;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/j;->b()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/w0;->b:LZ/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LZ/j;->c(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final d(Ljava/lang/String;LB5/a;)LZ/h;
    .locals 1

    .line 1
    iget-object v0, p0, LC0/w0;->b:LZ/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LZ/j;->d(Ljava/lang/String;LB5/a;)LZ/h;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
